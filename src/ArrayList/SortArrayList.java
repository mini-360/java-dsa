package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);

        // since we are simply passing the list so it will be reversed in ascending order
        Collections.sort(l1);
        System.out.println("Sorted list  ascending order: " + l1);

        // to sort the list in descending order we have to pass Collections.reverseOrder() along with the list
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sorted list  reverse order: " + l1);


        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Welcome");
        l2.add("To");
        l2.add("Hilsa");
        Collections.sort(l2, Collections.reverseOrder());
        System.out.println("Reverse order sorted  string : " + l2);
        Collections.sort(l2);
        System.out.println("sorted  string : " + l2);
    }
}
