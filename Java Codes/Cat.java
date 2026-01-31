// A program to understand static and non-static variables

public class Cat {
    static int catCount = 0;
    static String name;
    int age;

    public Cat(){ // Increases cat count by 1 everytime cat object is created
        catCount++;
    }

    public static int getCatCount(){ // Returns cat count
        return catCount;
    }
}
