public class SwapNums {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Num1 = " + num1 + " Num2 = " + num2);

        change(num1,num2);

        System.out.println("Num1 = " + num1 + " Num2 = " + num2);
    }
    static void change (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
