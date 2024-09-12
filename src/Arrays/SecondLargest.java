package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements inside array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        SecondLargest obj = new SecondLargest();
        int ans = obj.secondLargest(arr);
        System.out.println("Second largest in the array is : " + ans);
    }

    int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        int secMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > secMax && i != max) {
                secMax = i;
            }
        }
        return secMax;
    }
}
