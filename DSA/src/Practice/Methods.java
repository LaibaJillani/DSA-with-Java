// Understanding String Methods, how to use them for string and get desired functionality
package Practice;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String message = "Hello World"; // A string object message

        System.out.println(message); // prints message

        System.out.println(Arrays.toString(message.toCharArray())); // prints in the form of character array

        System.out.println(message.toLowerCase()); // Convert upper case words to lower case

        System.out.println(message.indexOf('o')); // find first index of 'o' in message

        System.out.println("     Laiba   ".trim()); // removes whitespaces

        System.out.println(Arrays.toString(message.split(" "))); // where it finds " "(spcae) in message

        String name1 = new String("LAIBA");
        String name2 = new String("LAIBA");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2)); // .equal() method for comparing two strings
    }
} 