package Arrays;

import java.util.Scanner;

public class SquareArray {
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
        SquareArray obj = new SquareArray();
        System.out.println("Original Array ");
        obj.printArray(arr);

        System.out.println("Array after sorting ");
        int[] ans = obj.squareArray(arr);
        obj.reverse(ans);
        obj.printArray(ans);


    }

    // Using extra space
    int[] squareArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = 0;
        while (left <= right) {
            int leftVal = Math.abs(arr[left]);
            int rightVal = Math.abs(arr[right]);
            if (leftVal > rightVal) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }

        }
        return ans;
    }


    void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
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
