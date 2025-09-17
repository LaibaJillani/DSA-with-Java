import java.util.Arrays;

public class VarAgs {

    public static void main(String[] args) {
        System.out.print("Variables in Arguments:- ");
        testcase(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println();
        testcase2(20, 21, "Laiba", "Areeba", "Mannan");
    }

      static void testcase (int ...v) {
      System.out.println(Arrays.toString(v));
  }

    static void testcase2(int a , int b , String ...l) {
        System.out.print(a + " " + b + " " + Arrays.toString(l));
    }
}
