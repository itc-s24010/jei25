public class D53Q25kadai {
    public static void main(String[] args) {
        char[] ch = {'A','B','C'};
        String s1 = new String("ABC");
        String s2 = s1;
        //参照元を比較する「==」演算子でもtrueを出すために
        //chは使わず、s2にs1を代入して、参照先を同じにした
        boolean b1 = s1 == s2;
        boolean b2 = s1.equals(s2);
        System.out.println(b1 + " " + b2);
    }
}
