package Arrays2D;

import java.util.Scanner;

public class Transpose {
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
        Transpose tp = new Transpose();
        System.out.println("Original Matrix");
        tp.printArray(arr);
        System.out.println("Transpose Matrix");
//        int[][] ans = tp.transposeMatrix(arr);
        int[][] ans = tp.transposeInPlace(arr);
        tp.printArray(ans);
    }

    // Using extra space / extra array to store the resultant transpose array
    int[][] transposeMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    // Doing in the same array // in place

    int[][] transposeInPlace(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = i+1; j < row; j++) {
                swap(arr, i, j);
            }
        }
        return arr;
    }

    void swap(int[][] matrix, int row, int col) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
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
}
