package Arrays;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        CountOccurrence obj = new CountOccurrence();
        Scanner pk = new Scanner(System.in);
        int target, size;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        System.out.print("Enter target : ");
        target = pk.nextInt();
        int ans = obj.countTarget(arr, target);
        System.out.println("Occurrence of " + target + " is : " + ans);
    }

    int countTarget(int[] arr, int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target) {
                count++;
            }
        }
        return count;
    }
}
