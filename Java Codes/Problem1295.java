// Leetcode Problem 1295

public class Problem1295 {
    public static void main(String[] args) {
       int[] array = {1234 , 45, 223, 6789, 1};
       int ans = findNumbers(array);
        System.out.println(ans);
        System.out.println(findNumbers1(array));
    }
    // My solution
    static int findNumbers(int[] numbers) {
        int count = 0;
        for (int index = 0; index < numbers.length  ; ++index) {
            String strNumber = "" + numbers[index];
            if (strNumber.length() % 2 == 0 ) {
                ++count;
            }
        }
        return count;
    }

    // Other Method
    static int findNumbers1(int[] numbers) {
        int count = 0;
        for ( int num : numbers){
            if (even(num)) {
                ++count;
            }
        }
        return count;
    }
    static boolean even(int number) {
        int numberOfDigits = digits(number);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    static int digits(int num){
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
      /*  int countOfNum = 0;
        while (num > 0) {
            ++countOfNum;
            num = num / 10;
        }
        return countOfNum; */
    }
}
