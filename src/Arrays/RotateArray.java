package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        RotateArray obj = new RotateArray();
        int size, k;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        System.out.print("Enter value of k : ");
        k = pk.nextInt();
        k = k % size;
        System.out.println("Array before rotation : ");
        obj.printArray(arr);

//        int[] ans = obj.rotateArray(arr, k);
//        System.out.println("Array after rotation ");
//        obj.printArray(ans);
        System.out.println("Array after rotation ");
        int[] anAns = obj.rotateArrayInPlace(arr, k);
        obj.printArray(anAns);


    }

    // rotating an array using an extra array / extra space
    int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] ansArr = new int[n];
        if (k == 0) return arr;
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ansArr[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ansArr[j++] = arr[i];
        }
        return ansArr;
    }

    // rotating without using an extra array/ no extra space
    int[] rotateArrayInPlace(int[] arr, int k) {
        int n = arr.length;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
        return arr;

    }

    void reverseArray(int[] arr, int st, int end) {
        int left = st, right = end;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
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
