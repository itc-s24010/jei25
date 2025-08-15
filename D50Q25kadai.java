public class D50Q25kadai {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            if (i % 2 != 0) {
                continue; // 奇数はスキップ
            }
            System.out.print(i); // 改行なしで出力
        }
        System.out.println(); // 最後に改行
    }
}
