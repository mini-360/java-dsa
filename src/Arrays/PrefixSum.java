package Arrays;

import java.util.Scanner;

public class PrefixSum {
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
        PrefixSum ps = new PrefixSum();
        System.out.println("Original Array");
        ps.printArray(arr);

//        int[] ans = ps.prefixSumExtraArray(arr);
//        ps.printArray(ans);
        int[] ans2 = ps.prefixSumWithoutSpace(arr);
        System.out.println("Prefix Sum array using extra space");
        ps.printArray(ans2);
    }

    // Finding Prefix Sum using an extra array
    int[] prefixSumExtraArray(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }
        return ans;
    }

    // Finding Prefix Sum without using any extra space
    int[] prefixSumWithoutSpace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
