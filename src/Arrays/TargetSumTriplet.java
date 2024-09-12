package Arrays;

import java.util.Scanner;

public class TargetSumTriplet {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int size, targetSum;
        System.out.print("Enter length of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements inside the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        System.out.print("Enter target sum : ");
        targetSum = pk.nextInt();
        TargetSumTriplet obj = new TargetSumTriplet();
        int ans = obj.targetSumTriplet(arr, targetSum);
        System.out.println("No. of triplets : " + ans);
    }

    int targetSumTriplet(int[] arr, int targetSum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1 ; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) count++;
                }
            }
        }
        return count;
    }
}
