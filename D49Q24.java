public class D49Q24 {
    public static void main(String[] args) {
        int value[] = {10,20,30,40};
        int sum = 0;

        for(int i = 0; i < value.length; i++){
            sum += value[i];
        }
        System.out.println(sum);
        System.out.println(value.length);
    }
}
