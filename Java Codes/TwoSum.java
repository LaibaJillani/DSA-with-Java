import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,8,7,0};
        System.out.println(Arrays.toString(nums));
        int target = 7;
        int[] result = solution(nums,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] solution (int[] nums,int target){
            int length = nums.length;
            for (int initial = 0; initial < length ; ++initial) {
                for (int end = initial + 1 ; end < length ; ++end) {
                    if (nums[initial] + nums[end] == target) {
                        return new int[]{initial,end};
                    }
                }
            }
            return new int[0];
    }
}
