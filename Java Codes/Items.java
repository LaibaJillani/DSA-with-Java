//  program to find number of Items and Total cost of Items
public class Items {
    public static void main(String[] args) {
        int items = 5;
        float costperitem = 50.55f;
        char currency = '$';
        
        float totalcost = items * costperitem;

        System.out.println("Items: " + items);
        System.out.println("Cost per Item: " + costperitem + currency);
        System.out.println("Total Cost: " + totalcost + currency);
    }
}