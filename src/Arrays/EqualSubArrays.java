package Arrays;

import java.util.Scanner;

public class EqualSubArrays {
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
        EqualSubArrays esa = new EqualSubArrays();
        if (esa.equalSumPartition(arr)) {
            System.out.println("Partition is Possible");
        } else {
            System.out.println("Partition is not Possible");
        }

    }

    int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        return totalSum;
    }

    boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int j : arr) {
            prefSum += j;
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) return true;
        }
        return false;

    }

    int[] prefixSum(int[] arr) {
        int[] preSum = new int[arr.length];
        preSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        return preSum;
    }

    int[] suffixSum(int[] arr) {
        int[] sufSum = new int[arr.length];
        sufSum[sufSum.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            sufSum[i] = sufSum[i + 1] + arr[i];
        }
        return sufSum;
    }
}
