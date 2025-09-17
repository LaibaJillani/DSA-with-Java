// Arrays practice and syntax understanding
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // One dimensional array
        // Method One directly declare and initialize
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        // Method Two of declaration using for loop
        System.out.println("Enter Input: ");
        int[] array1D = new int[5]; // new keyword creates a new object in heap
        // Taking input
        for (int index = 0; index < array1D.length ; index++) {
            array1D[index] = input.nextInt();
        }
        // Output using for loop
        for (int index = 0; index < array1D.length ; index++) {
            System.out.print(array1D[index] + " ");
        }
        System.out.println();
        // Enhanced for loop
        for (int number : array1D) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Two Dimensional Arrays
        // Method One
        int[][] array2D = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println(Arrays.deepToString(array2D)); // Method one printing 2D Array

    // Method two of declaration of 2D Array using for loop
    int[][] arr2D = new int[3][3];
    System.out.println("Enter Input for 2D Array: ");
    // input
    for (int rows = 0; rows < arr2D.length ; ++rows) {
        for (int columns = 0; columns < arr2D[rows].length ; ++columns) {
            arr2D[rows][columns] = input.nextInt();
        }
    }
    System.out.println("Output by method 1(deepToString):");
    System.out.println(Arrays.deepToString(arr2D));

    System.out.println("Output by method 2(for loop):");
    for (int rows = 0; rows < arr2D.length ; ++rows) {
            for (int columns = 0 ; columns < arr2D[rows].length ; ++columns) {
                System.out.print(arr2D[rows][columns] + " ");
            }
        System.out.println();
    }
    System.out.println("Output by method 3(enhanced for loop):");
    for (int[] ints : arr2D) { // for rows
            for (int columns = 0; columns < ints.length; ++columns) { // for columns
                System.out.print(ints[columns] + " ");
            }
        System.out.println();
        }
    }
}
