import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        //Take input from user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //For 1 and numbers less than 1
        if (number <= 1) {
            System.out.println("Neither Prime nor Composite number.");
        }
        else {
        int tempnumber = 2;
        //Using square root method
            while (tempnumber * tempnumber <= number) {
                if (number % tempnumber == 0) {
                    System.out.println("Not a Prime number.");
                    return;
                }
                tempnumber++;
            }
            //After all the numbers are checked and remainder is not equal to zero Number is prime
                System.out.println("Prime number.");
        }
    }
}