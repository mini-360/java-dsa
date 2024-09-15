package Arrays;

import java.util.Scanner;

public class MoveEvenOdd {
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
        MoveEvenOdd obj = new MoveEvenOdd();
        System.out.println("Original Array ");
        int[] ans = obj.moveArrayElements(arr);
        obj.printArray(arr);
        System.out.println("Array after modification ");
        obj.printArray(ans);
    }

    // without using any extra array, in place modification
    int[] moveArrayElements(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0) left++;
            if (arr[right] % 2 != 0) right--;
            else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return arr;
    }

    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
