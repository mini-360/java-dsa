package Recursion;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array : ");
        n = pk.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = pk.nextInt();
        }
        SortedOrNot aon = new SortedOrNot();
        boolean ans = aon.isSorted(arr, 0);
        if (ans) {
            System.out.println("Given array is sorted");
        } else {
            System.out.println("Given array is not sorted");
        }
    }

    // it will only check whether the array is sorted in ascending order or not
    public boolean isSorted(int[] arr, int idx) {
        int n = arr.length;
        if (idx >= n) {
            return true;
        }
        if (arr[idx] > arr[idx]) {
            return false;
        }
        return isSorted(arr, idx + 1);
    }
}
