package Recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
//        Scanner pk = new Scanner(System.in);
//        int n;
//        System.out.print("Enter length of the array : ");
//        n = pk.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements in the array : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = pk.nextInt();
//        }
//        System.out.print("Enter target : ");
//        int target = pk.nextInt();
        int[] arr={1,2,1,4,1};


        LastIndex li = new LastIndex();
//        int ans = li.lastIndex(arr, 0, target);
        int ans = li.lastIndex(arr, 0, 1);
        System.out.println(ans);
    }

    public int lastIndex(int[] arr, int idx, int target) {
        int n = arr.length;
        if (idx == n) {
            return -1;
        }
        int smallAns = lastIndex(arr, idx + 1, target);

        if (smallAns != -1) {
            return smallAns;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return -1;

    }
}
