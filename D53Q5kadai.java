public class D53Q5kadai {
    public static void main(String[] args) {
        // 引数が足りない場合のチェック（商品ごとに4項目必要）
        if (args.length % 4 != 0 || args.length == 0) {
            System.out.println("エラー: 商品は (個数 タイプ 商品名 単価) の順で入力してください。");
            return;
        }

        int totalExTax = 0; // 税抜合計
        int totalInTax = 0; // 税込合計

        // 見出し
        System.out.printf("%-6s %8s %8s %8s%n", "商品名", "税抜", "税込", "タイプ");

        // 4つずつ処理（個数、タイプ、商品名、単価）
        for (int i = 0; i < args.length; i += 4) {
            try {
                int quantity = Integer.parseInt(args[i]);        // 個数
                String typeCode = args[i + 1];                   // 税区分コード (f or その他)
                String name = args[i + 2];                       // 商品名
                int price = Integer.parseInt(args[i + 3]);       // 単価（税抜）

                int exTax = quantity * price; // 税抜価格
                int taxRate = typeCode.equalsIgnoreCase("f") ? 8 : 10;
                int inTax = (int) Math.round(exTax * (1 + taxRate / 100.0));

                String typeLabel = typeCode.equalsIgnoreCase("f") ? "食品等" : "その他";

                // 表示
                System.out.printf("%-6s %8d円 %8d円 %8s%n", name, exTax, inTax, typeLabel);

                // 合計計算
                totalExTax += exTax;
                totalInTax += inTax;

            } catch (NumberFormatException e) {
                System.out.println("エラー: 数値変換に失敗しました。入力を確認してください。");
                return;
            }
        }

        // 合計表示
        System.out.printf("%-6s %8d円 %8d円%n", "合計", totalExTax, totalInTax);
    }
}
