package Arrays;

import java.util.Scanner;

public class Sort0sAnd1s {
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

        Sort0sAnd1s obj = new Sort0sAnd1s();

        System.out.println("Unsorted Array");
        obj.printArr(arr);

//        System.out.println("Sorted Array using swap method");
//        int[] ans = obj.sortArray(arr);
//        obj.printArr(ans);

        System.out.println("Sorted array using count method");
        int[] ansCount = obj.sortUsingCount(arr);
        obj.printArr(ansCount);
    }

    // Using swap method
    int[] sortArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return arr;
    }

    // Using count method
    int[] sortUsingCount(int[] arr) {
        int zero = countZero(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i < zero) arr[i] = 0;
            else arr[i] = 1;
        }
        return arr;
    }

    // Counting zero in the array
    int countZero(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i == 0) count++;
        }
        return count;
    }

    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
