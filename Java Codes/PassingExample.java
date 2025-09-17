// Pass by value examples in Java

public class PassingExample {
    public static void main(String[] args) {
        String name = "Computer Science";
        change(name);
        System.out.println(name); // will print Computer Science because original object is not changed

        int age = 21;
        check(age); // Value of age will be passed to function check
    }
    static void change(String naam) {
        // We have created a new variable new object not changed original one
        naam = "Software Engineering";
    }

    static void check(int number) {
        System.out.println(number); // number will have value of age
    }
}
