package Practice;

import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {4 , 5, 6, 7 , 0 , 1 , 3 , 4};
        int target = input.nextInt();
        int answer = search(nums , target);
        System.out.println(answer);
    }

    static int search(int[] nums, int target) {
        int answer = -1;
        // Three cases to find target
        // Case 1
        int pivot = findPivot(nums);
        if (pivot == -1) {
            answer = BinarySearch(nums, target, 0, nums.length - 1);
        }
        // Case 2
        else if (target == nums[pivot]) {
            return pivot;
        }
        // Case 3
        else if (target >= nums[0]) {
            answer = BinarySearch( nums,target, 0, pivot - 1);
        }
        // Case 4
        else if (target <= nums[0]) {
            answer = BinarySearch( nums, target, pivot +1, nums.length - 1);
        }
        return answer;
    }

    static int BinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            // There are 4 cases to find pivot (largest number in array)
            // Case 1
            if (nums[middle] > nums[middle + 1]) {
                return middle;
            }
            // Case 2
            else if (nums[middle] < nums[middle - 1]) {
                return middle - 1;
            }
            // Case 3
            else if (nums[start] >= nums[middle]) {
                end = middle - 1;
            }
            // Case 4
            else {
                start = middle + 1;
            }
        }
        return -1;
    }
}