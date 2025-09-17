package Practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1 , 14 , 18, 25 , 28 , 32 , 37, 40};
        System.out.println("Array is: " + Arrays.toString(array));
        int target = 11;
        System.out.println("Target is: " + target);
        int answer = binarySearch(array,target);
        System.out.println("Answer is at index: " + answer);
    }

    // Return the index
    static int binarySearch(int[] numbers , int target) {
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
        // returns -1 if the target is not found
        return -1;
    }
}
