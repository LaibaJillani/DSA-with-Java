package Practice;

import java.util.Arrays;

public class First_and_LastPosition {
    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        int target = 8;
        int[] answer = searchRange(array,target);
        System.out.println(Arrays.toString(answer));
    }
        static int[] searchRange(int[] numbers, int target) {
            int[] answer = {-1, -1};
            int start = Search(numbers,target,true);
            int end = Search(numbers,target,false);

            answer[0] = start;
            answer[1] = end;
            return answer;
        }

   static int Search(int[] numbers, int target , boolean firstIndex) {
        int answer = -1;
        int start = 0;
        int end = numbers.length - 1;

       while (start <= end) {
           int middle = start + (end - start) / 2;

           if (target < numbers[middle]) {
               end = middle - 1;
           } else if (target > numbers[middle]) {
               start = middle + 1;
           } else {
               answer = middle;
               if (firstIndex) {
                   end = middle - 1;
               } else {
                   start = middle + 1;
               }
           }
       }
       return answer;
   }
}
