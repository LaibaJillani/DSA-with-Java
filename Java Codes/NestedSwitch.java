import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.print("Enter a fruit: ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits!");
                break;
            case "Apple":
                System.out.print("Choose a Color: ");
        String color = input.next();
                switch (color) {
                    case "Green":
                System.out.println("Sweet hard fruit!");
                break;
                    case "Red":
                        System.out.println("Sweet Red fruit!");
                        break;
                    default:
                        System.out.println("Wrong Color!!");
                }
                break;
            case "Banana":
                System.out.println("Monkeys favourite fruit!");
                break;
            case "Grapes":
                System.out.println("Small fruit!");
                break;
            default:
                System.out.println("None of my fruits:(");
        }
    }
}
