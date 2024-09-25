package ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // add an element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(0));

        // print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");  // 5 6 7 8
        }
        System.out.println();

        // print with for each loop
        for (Integer i : l1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // printing the ArrayList directly
        System.out.println(l1); //[5, 6, 7, 8]

        // adding element at some index i
        l1.add(1, 10);
        System.out.println(l1); // [5, 10,6,7,8]


        // modifying element at index i
        l1.set(1, 100);
        System.out.println(l1); // [5,100,6,7,8]


        // removing an element at index i
        l1.remove(1);
        System.out.println(l1); // [5,6,7,8]


        // removing an element e we don't ko=now it's index
        l1.remove(Integer.valueOf(7)); // [5,6,8]
        System.out.println(l1);


        // checking if an element exists or not
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify a wrapper class, you can put anything inside the list
        ArrayList l = new ArrayList();
        l.add("suresh");
        l.add(12);
        l.add(4.5f);
        System.out.println(l);


    }
}
