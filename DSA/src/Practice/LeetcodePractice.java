package Practice;

import java.util.Arrays;

public class LeetcodePractice {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] answer = getConcentration(arr);
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcentration(int[] numbers) {
        int[] ans = new int[2*numbers.length];
        int num = 0;
        while (num < numbers.length) {
           ans[num] = numbers[num];
       ans[num + numbers.length] = numbers[num];
           ++num;
      }
       return ans;
    }

        static int[] runningSum(int[] numbers) {
            int[] answer= new int[numbers.length];
            int number = 0;
            answer[number] = numbers[number];
            for (number = 1; number < numbers.length; ++number) {
                for (int number2 = 0; number2 < number; ++number2) {
                    answer[number] = numbers[number] + answer[number2];
                }
            }
            return answer;
        }
}
