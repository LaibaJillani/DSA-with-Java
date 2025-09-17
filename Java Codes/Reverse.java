import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter your Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = 0;

        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            result = result * 10 + remainder;
        }

        System.out.println("Reverse : " + result);
    }
}
