package Arrays2D;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int row, col;
        System.out.print("Enter row col : ");
        row = pk.nextInt();
        col = pk.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = pk.nextInt();
            }
        }
        RotateArray ra = new RotateArray();
        System.out.println("Original Array ");
        ra.printArray(arr);

        System.out.println("Matrix after rotation ");
        int[][] ans = ra.rotateMatrix(arr);
        ra.printArray(ans);
    }

    int[][] rotateMatrix(int[][] arr) {
        int[][] ans = transposeMatrix(arr);
        int row = ans.length;
        for (int i = 0; i < row; i++) {
            reverseArray(arr[i]);
        }
        return ans;
    }

    int[][] transposeMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = i + 1; j < row; j++) {
                swap(arr, i, j);
            }
        }
        return arr;
    }

    void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int val : i) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
