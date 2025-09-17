package Practice;

import java.util.Arrays;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] array = {1 , 14 , 18, 25 , 28 , 32 , 37, 40};
        System.out.println("Array is: " + Arrays.toString(array));
        int target = 28;
        System.out.println("Target is: " + target);
        int answer = Ceiling(array,target);
        System.out.println("Answer is at index: " + answer);
    }

    // Return the index
    static int Ceiling(int[] numbers,int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            // If middle is declared as (start + end)/2 it might be possible that it exceeds int range in Java
            int middle = start + (end - start) / 2;
            if (target < numbers[middle]) {
                end = middle - 1;
            }
            else
            if (target > numbers[middle]) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return start;
    }
}
