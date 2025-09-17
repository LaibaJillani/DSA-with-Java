import java.util.Scanner;

public class FunctionAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Reversing:- ");
        System.out.print("Enter a number: ");
        int integer = input.nextInt();
        System.out.print("Reverse is: ");
        reverse(integer);

        System.out.println("For checking frequency of a digit in given number:-");
        System.out.print("Enter a number: ");
        int integer2 = input.nextInt();
        System.out.print("Enter a digit from your number: ");
        int integer3 = input.nextInt();
        int frequency = frequencyCheck(integer2,integer3);
        System.out.print("The frequency of digit in your number is : " + frequency);

        System.out.println("For checking a number is prime or not:-");
        System.out.print("Enter a number: ");
        int integer4 = input.nextInt();
        isPrime(integer4);

        System.out.println("For Amstrong:-");
        System.out.println("Enter a 3 digit number: ");
        int integer5 = input.nextInt();
        isArmstrong(integer5);
        allArmstrong();
    }

    static void reverse(int number) {
            int result = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            result = (result * 10) + remainder;
        }
        System.out.println(result);
    }

    static int frequencyCheck(int number2, int number3) {
        int count = 0;
        while (number2 > 0) {
            int remainder2 = number2 % 10;
            if (number3 == remainder2) {
                ++count;
            }
            number2 = number2 / 10;
        }
        return count;
    }

    static void isPrime(int number4) {
     if (number4 <= 1) {
         System.out.println("Neither Prime nor Composite.");
         return;
     }
     int tempnum = 2;
     while (tempnum * tempnum <= number4) {
         if (number4 % tempnum == 0) {
             System.out.println("Not a prime number!");
         }
         ++tempnum;
     }
     System.out.println("Is a prime number!");
    }

    static void isArmstrong(int number5) {
        int original = number5;
        int result = 0;
        while (number5 > 0) {
            int remainder = number5 % 10;
            number5 = number5 / 10;
            result = result + remainder * remainder * remainder;
        }
        if (result==original) {
            System.out.println("It is Armstrong!");
        }
    }

    static void allArmstrong(){
        for (int number6 = 100 ; number6 <= 1000 ; ++number6) {
            isArmstrong(number6);
            System.out.println(number6 + " ");
        }
    }
}
