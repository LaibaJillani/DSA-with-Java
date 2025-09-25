package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    static void selection(int[] array) {
        for (int number = 0; number < array.length; ++number){
            int last = array.length - 1 - number;
            int maximum = findMaximum(array,0,last);
            swap(array,maximum,last);
        }
    }

    static void swap(int[] array, int first, int second) {
        int temporary = array[first];
        array[first] = array[second];
        array[second] = temporary;
    }

    static int findMaximum(int[] array, int start, int end){
        int maximum = start;
        for (int index = start; index <= end; ++index){
            if(array[start] < array[index]) {
                maximum = index;
            }
        }
        return maximum;
    }
}
