import java.util.Arrays;

public class SwapNumbers {
    public static void main(String[] args) {
        int[] array= {10,20,30,40,50};
        swap(array, 3 , 4);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
         numbers[index1] = numbers[index2];
         numbers[index2] = temp;
    }
}
