import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.print("Enter your Salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 20000) {
            salary += 5000;
            System.out.println("Now Salary is: " + salary);
        } else if (salary > 10000) {
            salary += 2000;
            System.out.println("Now Salary is: " + salary);
        } else {
            System.out.println("Salary is same. " + salary);
        }
    }
}
