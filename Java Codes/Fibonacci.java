import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int count = 2;

        while (count <= number) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            ++count;
        }
        System.out.println("At this point Fibonacci term is: " + num2);
    }
}
