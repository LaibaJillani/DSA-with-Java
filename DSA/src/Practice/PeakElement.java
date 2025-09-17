package Practice;
// A program to find index of peak element in a Mountain Array entered by user.
import java.util.ArrayList;
import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        // Bitonic array in which numbers increase first and then decrease in a sorted manner or vice versa
        System.out.println("Enter numbers for Bitonic Array: ");
        // Input array when size is not specified
        while (input.hasNextInt()) { // Keep taking input until user enters anything other than integer
            int numbers = input.nextInt();
            array.add(numbers);
        }
        System.out.println(array);
        int answer = findPeakElement(array);
        System.out.println("The peak element is at index: " + answer);
    }

    // This function returns index of peak element in Array using BinarySearch
    static int findPeakElement(ArrayList<Integer> numbers) {
        int start = 0;
        int end = numbers.size() - 1; // numbers.size() for getting size of array

        while (start < end) {
            int middle = start + (end - start) / 2;
            // If number at middle is greater than number at middle + 1 shift end to middle
            // Because middle may be our answer
            if (numbers.get(middle) > numbers.get(middle + 1)) {
                end = middle;
            } else { // If number at middle is smaller than number at middle + 1 shift start to middle + 1
                start = middle + 1;
            }
        }
        return start; // Or return end because when loop breaks end becomes equal to start
    }
}
