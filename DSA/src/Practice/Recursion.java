// A program for printing nth Fibonacci term using Recursion
package Practice;

public class Recursion {
    public static void main(String[] args) {
        int number = 10;
        int answer = fib(number);
        System.out.println(answer);
    }

    static int fib(int n) {
        // base condition
        if ( n < 2) {
            return n;
        }
        // recurrence relation
        return fib(n - 1) + fib(n - 2);
    }
} 