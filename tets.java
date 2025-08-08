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
/*
case switchの()内と比較し、等しければその後ろの文を実行する
break case文の中に入れ、実行されるとswitchの処理全体を終了させる
fall-through case文の中に入れ、次のcase文も実行する（デフォルトでこれ）
 */