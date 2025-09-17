// Taking input for Arrays
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        // When we take input using for loop we have to declare size already
        for (int initial = 0; initial < array.length ; initial++) {
            array[initial] = input.nextInt();
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
