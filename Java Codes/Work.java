import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For checking frequency of a digit in given number:-");
        System.out.print("Enter a number: ");
        int integer = input.nextInt();
        System.out.print("Enter a digit from your number: ");
        int integer2 = input.nextInt();
        int answer = frequencyCheck(integer,integer2);
        System.out.print("The frequency of digit in your number is : " + answer);
    }

    static int frequencyCheck(int number, int number2) {
        int count = 0;
        while (number > 0) {
            int remainder = number % 10;
            if (number2 == remainder) {
                ++count;
            }
            number = number / 10;
        }
        return count;
    }
}
