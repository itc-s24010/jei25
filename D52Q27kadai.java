public class D52Q27kadai {
    enum Signal {
        RED, YELLOW, GREEN;
    }

    public class Q27 {
        public static void main(String[] args) {
            Signal sig = Signal.YELLOW;  // ← 修正ポイント

            if (sig == Signal.GREEN) {
                System.out.println("緑");
            } else if (sig == Signal.YELLOW) {
                System.out.println("黄");
            } else {
                System.out.println("赤");
            }
        }
    }
}

