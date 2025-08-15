class D52Q6 {
    public static void main(String[] args) {
        Drink2[] dr = {
                new Drink2("Gomacola",150),
                new Drink2("MrPepper",130),
                new Drink2("SaltWater",320)
        };
        VendingMachine2 vm =  new VendingMachine2(dr);
        vm.display();
        String[] scenario = {
                "i 100",
                "p 2",
                "i 500",
                "p 3",
                "c 0"
        };
        for (String command : scenario) {
            vm.execCom(command);
        }
    }
}

class Drink2{
    private String name;
    private int price;
    Drink2(String name, int price){
        this.name = name;
        this.price = price;
    }
    public  String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public String toString(){
        return "[" + name + "] " + price + "円";
    }
}

class VendingMachine2{
    private Drink2[] drinks;
    private int cash = 0;
    private int[] coins = {500,100,50,10};
    VendingMachine2(Drink2[] drinks){
        this.drinks = drinks;
    }

    public void display() {
        int idx = 1;
        for(Drink2 drink : drinks){
            System.out.println(" [" + idx + "] " + drink);
            idx++;
        }
    }
    public void execCom(String command){
        String[] s = command.split(" ");
        switch (s[0]) {
            case "i":
                if (isCoin(s[1])) cash = Integer.parseInt(s[1]);
                break;
            case "p":
                int idx = Integer.parseInt(s[1]) - 1;
                if (idx < 0 || idx >= drinks.length) return;
                int price = drinks[idx].getPrice();
                if (price <= cash) {
                    eject(idx);
                    cash -= price;
                    payChange();
                } else {
                    System.out.println("お金が足りません");
                }
                break;
            case "c":
                payChange();
                break;
            default:
                break;
        }
    }
    private boolean isCoin(String s) {
        int c = Integer.parseInt(s);
        for (int coin : coins) {
            if (c == coin) return true;
        }
        return false;
    }
    private void eject(int idx){
        System.out.println(drinks[idx] + " が排出されました");
    }
    private void payChange(){
        if(cash <= 0) {
            System.out.println("お釣り なし");
            return;
        }
        String s = "お釣り ";
        for (int coin : coins) {
            if (cash / coin > 0){
                s += coin + "円:" + (cash / coin) + "枚";
                cash %= coin;
            }
        }
        System.out.println(s);
    }
}