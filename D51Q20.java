public class D51Q20 {
    public static void main(String[] args) {
        boolean flg = true;
        int score = 85;
        String c = (flg = score >= 70) ? "合格" : "不合格";
        System.out.println(c);
    }
}
