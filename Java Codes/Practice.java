import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] answer = productExceptSelf(arr);
        System.out.println(Arrays.toString(answer));
    }

    static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int number = 1; number < nums.length; ++number) {
            answer[number] = answer[number - 1]*nums[number - 1];
        }
        int temporaryNumber = 1;
        for (int number2 = nums.length - 1; number2 >= 0; --number2) {
            answer[number2] = answer[number2]*temporaryNumber;
            temporaryNumber = temporaryNumber*nums[number2];
        }
        return answer;
    }
}
