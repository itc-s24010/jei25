public class D52Q5kadai{
    public static void main(String[] args) {
        int LIMIT = 400; // 最大値制限

        if (args.length == 0) return;

        int max = 0;
        int[] data = new int[args.length];

        // データ読み込みと最大値計算
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
            if (data[i] <= 0 || data[i] >= LIMIT) return;
            if (max < data[i]) max = data[i];
        }

        // 棒の長さは 10単位ごと
        int majormax = (max + 9) / 10; // 10単位に切り上げ

        // 目盛りラベル（0, 10, 20...）
        System.out.print("       ");
        for (int i = 0; i <= majormax; i++) {
            System.out.printf("%-10d", i * 10);
        }
        System.out.println();

        // 目盛り線
        System.out.print("       ");
        for (int i = 0; i < majormax; i++) {
            System.out.print("+---------"); // 10単位を線で表現
        }
        System.out.println();

        // 棒グラフ本体
        for (int val : data) {
            System.out.printf("%4d : ", val);
            int stars = (val + 9) / 10; // 10単位での長さ
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
