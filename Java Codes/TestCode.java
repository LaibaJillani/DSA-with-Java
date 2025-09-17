public class TestCode {
    public static void main(String[] args) {
        String name = "Laiba Jillani";
        identity(name);
        System.out.println(name);
        age();
    }
    static String identity(String name) {
        name = "Areeba Jillani";
        return name;
    }

    static void age () {
        int number = 20;
        System.out.println(number);
    }
}
