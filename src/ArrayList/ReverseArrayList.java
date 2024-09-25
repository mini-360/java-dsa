package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.print("Original list : " + l1);
        ReverseArrayList ral = new ReverseArrayList();
//        ral.reverseArrayList1(l1);
        System.out.println();
//        System.out.println("Reversed list method 1 : "+l1);
//        ral.ReverseArrayList2(l1);
//        System.out.println("Reversed list method 2 : "+l1);
        ral.reverseArrayList3(l1);
        System.out.println("Reverses list method 3 : " + l1);

    }

    // reverse ArrayList method 1
    void reverseArrayList1(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    // reverse ArrayList method 2
    void ReverseArrayList2(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    void reverseArrayList3(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

}
