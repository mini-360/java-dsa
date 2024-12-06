package Recursion;

import java.util.Scanner;

public class FindTarget {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
//        int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};
        int[] arr = {2};
        System.out.print("Enter the target value : ");
        int target = pk.nextInt();

        FindTarget ft = new FindTarget();
        boolean ans = ft.findTarget(arr, 0, target);
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public boolean findTarget(int[] arr, int idx, int target) {
        int n = arr.length;
        if (idx >= n) {
            return false;
        }
        if (target == arr[idx]) {
            return true; 
        }
        return findTarget(arr, idx + 1, target);
    }
}
