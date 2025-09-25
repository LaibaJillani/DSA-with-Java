package Practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3 , 5 , 2 , 1 , 4};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubble(int[] array){
        boolean swapped;
        for (int initial = 0; initial < array.length - 1; ++initial){
            swapped = false;
            for (int index = 1 ; index < array.length - initial; ++index) {
                if (array[index] < array[index - 1]) {
                    int temporary = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temporary;
                    swapped = true;
                }
            }
        if(!swapped) {
            break;
        }
        }
    }
}
