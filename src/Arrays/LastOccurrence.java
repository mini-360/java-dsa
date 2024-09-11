package Arrays;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        LastOccurrence obj = new LastOccurrence();
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
        int ans = obj.lastOccurrence(arr, target);
        System.out.println("Last Occurrence of " + target + " is : " + ans);
    }

    int lastOccurrence(int[] arr, int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
            }
        }
        return result;
    }
}
