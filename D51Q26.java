public class D51Q26 {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch(n){
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            default:
                s += "?";
        }
        System.out.println(s);
    }
}