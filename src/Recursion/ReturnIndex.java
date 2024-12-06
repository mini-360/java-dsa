package Recursion;

import java.util.Scanner;

public class ReturnIndex {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};
        System.out.print("Enter target : ");
        int target = pk.nextInt();

        ReturnIndex ri = new ReturnIndex();
        int ans = ri.findElement(arr, 0, target);
        System.out.println("Ans is : " + ans);
    }

    public int findElement(int[] arr, int idx, int target) {
        int n = arr.length;
        if (idx >= n) {
            return -1;
        }
        if (target == arr[idx]) {
            return idx;
        }
        return findElement(arr, idx + 1, target);
    }
}
