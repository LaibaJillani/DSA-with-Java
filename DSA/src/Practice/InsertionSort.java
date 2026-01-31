package Practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 1, 4};
        insertion(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertion(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            for (int index2 = index + 1; index2 > 0; index2--) {
                if (arr[index2] < arr[index2 - 1]) {
                    swap(arr, index2, index2 - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] array, int first, int second) {
        int temporary = array[first];
        array[first] = array[second];
        array[second] = temporary;
    }
}
