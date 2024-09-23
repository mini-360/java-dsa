package Arrays2D;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int row, col;
        System.out.print("Enter row and col : ");
        row = pk.nextInt();
        col = pk.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = pk.nextInt();
            }
        }
        SpiralMatrix sm = new SpiralMatrix();
        System.out.println("Original Matrix ");
        sm.printMatrix(arr);
        System.out.println("Spiral Matrix");
        sm.printSpiral(arr, row, col);

    }
    // printing all elements of matrix in spiral order
    void printSpiral(int[][] arr, int row, int col) {
        int topRow = 0, bottomRow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElements = 0;
        while (totalElements < (row * col)) {
//   print(topRow) -> leftCol to rightCol
            for (int i = leftCol; i <= rightCol && totalElements < (row * col); i++) {
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            topRow++;
//   print(rightCol) -> topRow to bottomRow
            for (int j = topRow; j <= bottomRow && totalElements < (row * col); j++) {
                System.out.print(arr[j][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
//   print(bottomRow) -> rightCol to leftCol
            for (int k = rightCol; k >= leftCol && totalElements < (row * col); k--) {
                System.out.print(arr[bottomRow][k] + " ");
                totalElements++;
            }
            bottomRow--;
//   print(leftCol) -> bottomRow to topRow
            for (int l = bottomRow; l >= topRow && totalElements < (row * col); l--) {
                System.out.print(arr[l][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

        }
    }

    void printMatrix(int[][] arr) {
        for (int[] ar : arr) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
