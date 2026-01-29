// Understanding String behaviour and Operations
package Practice;

import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {

        // Printing alphabets using String Concatenation
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch + " "; // series += ch
        }
        System.out.println(series);

        String name = "Laiba";
        System.out.println(name);

        name = "Jillani"; // here a separate object is created because, strings are immutable
        System.out.println(name);

        System.out.print("'a' + 'b' gives output ");
        System.out.println('a' + 'b'); // will give ASCII sum of a and b = 195

        System.out.print("\"a\" + 'b' gives output ");
        System.out.println("a" + 'b'); // will give ab

        System.out.print("\"a\" + \"b\" gives output ");
        System.out.println("a" + "b"); // will give ab String Concatenation

        System.out.print("(char)('a' + 3) gives output in char datatype ");
        System.out.println((char)('a' + 3));// will give d

        System.out.print("\"a\" + 1 gives output ");
        System.out.println("a" + 1); // will give a1
        // this is same as after a few steps "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("" + new ArrayList<>()); // empty array
        System.out.println("Hello " + new Integer(56));

        // To call toString() at least there should be one string
        String answer = new Integer(56) + "" + new ArrayList<>();
        System.out.println(answer);

    }
}