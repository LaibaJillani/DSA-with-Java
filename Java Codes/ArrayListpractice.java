// Arraylist Practice and syntax
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListpractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arraylist = new ArrayList<>();
        // Method one of initializing of Arraylist
        arraylist.add(12);
        arraylist.add(15);
        arraylist.add(10);
        arraylist.add(155);
        arraylist.add(153);
        arraylist.add(50);
        arraylist.add(34);
        arraylist.add(44);
        arraylist.add(84);
        arraylist.add(36);
        arraylist.add(300);
        arraylist.add(364);
        arraylist.add(834);
        arraylist.add(94);
        arraylist.add(374);
        // Arraylist functions
        System.out.println(arraylist.contains(15));
        // For Output
        System.out.println(arraylist);

        // For taking input and output at same time using for loop where we have to announce initial capacity already
        ArrayList<Integer> arraylist2 = new ArrayList<>(10);
        for (int number = 0; number < 10; number++) {
            arraylist2.add(input.nextInt());
            System.out.print(arraylist2.get(number) + " "); // .get() for getting element at that index
        }
        System.out.println();

        // Taking input when initial capacity is not specified, Takes input until enters something other than integer
        ArrayList<Integer> arraylist3 = new ArrayList<>();
        while(input.hasNextInt()) {
            int numbers = input.nextInt();
            arraylist3.add(numbers);
        }
        for (int num : arraylist3){
            System.out.print(num + " ");
        }
    }
}
