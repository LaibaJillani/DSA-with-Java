// A program for Sorting given array using Cyclic Sort
package Practice;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = { 3 , 4 , 1 , 5 , 2};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Cyclic Sort Algorithm says the correct index for any Number in ascendingly increasing array
    // is the number itself - 1, because array starts with index 0,
    // This function sorts the array according to this principle
    static void cyclicSort(int[] array) {
        int index = 0;
        while (index < array.length) {
        int correctIndex = array[index] - 1;
            if (array[index] != array[correctIndex]) {
                swap(array, index , correctIndex); // Calling swap function
            }
            else {
                ++index;
            }
        }
    }

    // This function swaps the number to it's correct index in array
    static void swap(int[] array ,int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
} 