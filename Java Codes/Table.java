import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();

        System.out.println("Your Table: ");
        int count;
            for (count = 1 ; count <= 10 ; ++count) {
                System.out.println(number + "*" + count + "=" + number  * count) ;
            }
    }
}
