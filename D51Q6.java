public class D51Q6 {
    public static void main(String[] args) {
        // コマンドシナリオ配列
        String[] scenario = {
                "i 100", // 100円投入
                "i 50",  // 50円投入
                "b C1",  // C1購入
                "r",     // 返金
                "i 500", // 500円投入
                "b C3"   // C3購入
        };

        // 自動販売機オブジェクト生成
        VendingMachine vm = new VendingMachine();

        // 配列のコマンドを順番に実行
        for (String command : scenario) {
            vm.execCom(command);
        }
    }
}

class Drink {
    private String code;
    private String name;
    private int price;

    public Drink(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getPrice() { return price; }
}

class VendingMachine {
    private int total;
    private Drink[] drinks = {
            new Drink("C1", "コーラ", 120),
            new Drink("C2", "水", 100),
            new Drink("C3", "お茶", 150)
    };

    public void execCom(String com) {
        String[] parts = com.split(" ");
        String cmd = parts[0];

        switch (cmd) {
            case "i": // 投入
                int money = Integer.parseInt(parts[1]);
                total += money;
                System.out.println(money + "円投入（残額: " + total + "円）");
                break;

            case "b": // 購入
                String code = parts[1];
                buyDrink(code);
                break;

            case "r": // 返金
                System.out.println("返金: " + total + "円");
                total = 0;
                break;

            default:
                System.out.println("不明なコマンド: " + com);
        }
    }

    private void buyDrink(String code) {
        for (Drink d : drinks) {
            if (d.getCode().equals(code)) {
                if (total >= d.getPrice()) {
                    total -= d.getPrice();
                    System.out.println(d.getName() + " を購入（残額: " + total + "円）");
                } else {
                    System.out.println("金額不足（必要: " + d.getPrice() + "円）");
                }
                return;
            }
        }
        System.out.println("商品コードが存在しません: " + code);
    }
}
