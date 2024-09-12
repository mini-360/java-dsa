package Arrays;

import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int size, targetSum;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        System.out.print("Enter target sum value : ");
        targetSum = pk.nextInt();
        TargetSumPair obj = new TargetSumPair();
        int ans = obj.targetSumPair(arr, targetSum);
        System.out.println("Total no. of pairs is : " + ans);
    }

    int targetSumPair(int[] arr, int targetSum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) count++;
            }
        }
        return count;
    }
}
