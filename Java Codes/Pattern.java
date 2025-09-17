public class Pattern {
    public static void main(String[] args) {
        int row = 5;
        for (int number = 1; number <= row ; ++number) {
            for (int number2 = 0; number2 < number; ++number2) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}