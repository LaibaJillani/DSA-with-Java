// Understanding String and String-Builder in Java and it's functions
package Practice;

public class stringBuilder {
    public static void main(String[] args) {
        String name = "HELLO";
        String name1 = toLowerCase(name);
        System.out.println(name1);

        String[] message = {"ab", "c"};
        String[] message1 = {"a", "bc"};
        boolean answer = arrayStringsAreEqual(message, message1);
        System.out.println(answer);
    }

    // This function coverts upper case string to lower case string
    static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    // This function checks if given strings are equal or not
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Memory allocation for appended strings
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        for(String word : word1){
            string1.append(word); // combines all characters from String[] word1
        }
        for(String word : word2){
            string2.append(word); // combines all characters from String[] word2
        }
        String s1 = string1.toString();
        String s2 = string2.toString();

        // checks if given strings are equal
        return s1.equals(s2);
    }
}