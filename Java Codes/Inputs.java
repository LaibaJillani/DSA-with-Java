import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Enter your Name : ");
        Scanner Input = new Scanner(System.in);
        String name = Input.nextLine();
        System.out.println("Enter your Roll Number : ");
        int rollnumber = Input.nextInt();

        System.out.println(name);
        System.out.println(rollnumber);
    }
}