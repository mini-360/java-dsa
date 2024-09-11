package Arrays;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        SortedOrNot obj = new SortedOrNot();
        if (obj.isSorted(arr)) {
            System.out.println("The Array is Sorted");
        } else {
            System.out.println("The Array is not Sorted");
        }
        pk.close();
    }

    boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i] >= arr[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
