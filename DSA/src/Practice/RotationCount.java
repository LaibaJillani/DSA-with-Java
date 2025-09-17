package Practice;

public class RotationCount {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        int answer = Rotation_Count(array);
        System.out.println(answer);
    }
    // Find Rotation Count
    static int Rotation_Count(int[] numbers) {
        int pivot = findPivot(numbers);
        return pivot + 1;
    }

    // Find index of pivot number(largest)
    static int findPivot(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            // There are 4 cases to find pivot (largest number in array)
            // Case 1
            if (numbers[middle] > numbers[middle + 1]) {
                return middle;
            }
            // Case 2
            else if (numbers[middle] < numbers[middle - 1]) {
                return middle - 1;
            }
            // Case 3
            else if (numbers[start] >= numbers[middle]) {
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
