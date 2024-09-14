package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        ReverseArray obj = new ReverseArray();
        int size;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        System.out.println("Array before reversal");
        obj.printArray(arr);

//        int[] ans = obj.reverseArray(arr);
//        System.out.println("Array after reversed");
//        obj.printArray(ans);

        int[] ans = obj.swapReverse(arr);
        System.out.println("Array after reversed");
        obj.printArray(ans);
    }

    // Using another array
    int[] reverseArray(int[] arr) {
        int[] ansArr = new int[arr.length];
        int l = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ansArr[l++] = arr[i];
        }
        return ansArr;
    }

    // Using swapping method
    int[] swapReverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
            swap(arr, left, right);
            left++;
            right--;
        }
        return arr;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
