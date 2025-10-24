// A program to find out how to access static and non-static variables

public class Kingdom {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount()); // Checking cat count before creating a cat object
        Cat.name = "Simba";
        Cat.name = "Stella"; // Static variable ->> name
        Cat myCat = new Cat(); // Creating cat object
        myCat.age = 3;
        System.out.println(Cat.name);
        System.out.println(Cat.getCatCount());  // Checking cat count after creating a cat object
    }
}
