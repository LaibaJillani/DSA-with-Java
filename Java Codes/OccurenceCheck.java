import java.util.Scanner;

public class OccurenceCheck {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        System.out.print("Enter a digit from your Number: ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        int count = 0;
        while (number1 > 0) {
            int remainder = number1 % 10;
            if (remainder == number2) {
                ++count;
            }
            number1 = number1 / 10;
        }
        System.out.println(count);
    }
}
