import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("Choose a day between Monday to Sunday: ");
        Scanner input = new Scanner(System.in);
        String day = input.next();

        if (day.equals("Monday")) {
            System.out.println("Let's Work!");
        } else
            if (day.equals("Tuesday")) {
                System.out.println("Energy full!");
            } else
            if (day.equals("Wednesday")) {
                System.out.println("Mid of week!");
            }else
            if (day.equals("Thursday")) {
                System.out.println("Mid of week!");
            }else
            if (day.equals("Friday")) {
                System.out.println("Yay Friday!");
            }else
            if (day.equals("Saturday")) {
                System.out.println("Weekend!");
            }else
            if (day.equals("Sunday")) {
                System.out.println("Weekend!");
            }
    }
}
