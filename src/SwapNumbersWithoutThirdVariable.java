public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(b);
        System.out.println(a);
    }
}
