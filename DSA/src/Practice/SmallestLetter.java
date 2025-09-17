package Practice;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] array1 = {'c','f','g'};
        char target1 = 'c';
        char[] array = {'x','x','y','y'};
        char target = 'z';
        char answer1 = nextGreatestLetter(array1,target1);
        char answer = nextGreatestLetter(array,target);
        System.out.println(answer1);
        System.out.println(answer);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
