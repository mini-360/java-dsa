package Arrays;

import java.util.Scanner;

public class SuffixSum {
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
        SuffixSum ss = new SuffixSum();
        System.out.println("Original Array");
        ss.printArray(arr);
        System.out.println("Array After suffix Sum");
        int[] ans = ss.suffixSum(arr);
        ss.printArray(ans);

    }

    int[] suffixSum(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i + 1] + arr[i];
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
