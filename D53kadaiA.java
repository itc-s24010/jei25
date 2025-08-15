public class D53kadaiA {
    public static void main(String[] args) {
        // 引数がない場合のエラーチェック
        if (args.length == 0) {
            System.out.println("エラー: 整数をコマンドライン引数として指定してください。");
            return;
        }

        int sum = 0;

        // 各引数を整数に変換して合計
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("エラー: '" + arg + "' は整数ではありません。");
                return;
            }
        }

        // 合計を表示
        System.out.println("合計=" + sum);
    }
}
