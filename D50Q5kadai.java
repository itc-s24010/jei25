public class D50Q5kadai {
    public static void main(String[] args) {
        // コマンドライン引数を整数配列に変換
        int[] num = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        // バブルソート
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    // 交換
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;

                    // 途中経過表示
                    System.out.print("ソート途中:");
                    for (int val : num) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("-------------------");

        // ソート結果表示
        System.out.print("ソート結果:");
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
