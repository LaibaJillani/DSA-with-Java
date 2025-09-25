package Practice;
// A program to perform binary search on a row-wise and column-wise sorted matrix(2D Array)
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 8, 20},
            {3, 9, 16, 24},
            {7, 14, 21, 40},
            {10, 17, 26, 45}
    };
        int target = 26;
        System.out.println(Arrays.toString(search(matrix,target)));
}
// Return the index of that particular row and column where target lies
static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column >= 0) {
           if (matrix[row][column] == target) {
               return new int[]{row,column};
           }
           else if (matrix[row][column] > target) {
               --column;
           } else {
               ++row;
           }
        }
    return new int[]{-1,-1};
    }
}
