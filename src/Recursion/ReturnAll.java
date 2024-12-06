package Recursion;

import java.util.Scanner;

public class ReturnAll {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 2, 5};
        System.out.print("Enter target : ");
        int target = pk.nextInt();

        ReturnAll ra = new ReturnAll();
        ra.returnAllIndex(arr, 0, target);
    }

    public void returnAllIndex(int[] arr, int idx, int target) {
        int n = arr.length;
        if (idx >= n) {
            return;
        }
        if (target == arr[idx]) {
            System.out.print(idx + " ");
        }
        returnAllIndex(arr, idx + 1, target);
    }
}
