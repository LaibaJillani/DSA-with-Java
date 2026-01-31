package Practice;

public class Pattern {
    public static void main(String[] args) {
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(9);
    }

    static void pattern3(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = n; cols >= rows; cols--) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                    System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int rows = 1; rows <= n; rows++) {
            if (rows <= 5) {
                for (int cols = 1; cols <= rows; cols++) {
                    System.out.print("*");
                }
            } else
                for (int cols = 1; cols <= n - rows + 1; cols++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
// Optimized Pattern 5
//    static void pattern5(int n) {
//        for (int row = 0; row < 2 * n; row++) {
//            int totalColsInRow = row > n ? 2 * n - row: row;
//            for (int col = 0; col < totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
}