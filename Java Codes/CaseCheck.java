import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word/Sentence: ");
        String word = input.nextLine();
        System.out.println("Your input is: " + word);
        System.out.print("Enter a number: " );
        int number = input.nextInt();
        char ch = word.trim().charAt(number);
        System.out.println("Character is: " + ch);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("A Lowercase letter!");
        } else {
            System.out.println("An Uppercase letter!");
        }
    }
}
