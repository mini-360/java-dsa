package Arrays2D;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.print("Enter r1 c1 : ");
        r1 = pk.nextInt();
        c1 = pk.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = pk.nextInt();
            }
        }
        System.out.print("Enter r2 c2 : ");
        r2 = pk.nextInt();
        c2 = pk.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = pk.nextInt();
            }
        }
        if (r1 != c2) {
            System.out.println("Please Enter valid matrix row of first matrix not equal to column of second matrix");
            return;
        }
        MatrixMultiplication mm = new MatrixMultiplication();
        System.out.println("Matrix after matrix multiplication ");
        int[][] product = mm.matrixMultiplication(arr1, arr2);
        mm.printArray(product);
    }

    int[][] matrixMultiplication(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length, c1 = arr1[0].length;
        int r2 = arr2.length, c2 = arr2[0].length;
        int[][] ansArr = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int value = 0;
                for (int k = 0; k < c1; k++) {
                    value += arr1[i][k] * arr2[k][j];
                }
                ansArr[i][j] = value;
            }
        }
        return ansArr;
    }

    void printArray(int[][] arr) {
        for (int[] val : arr) {
            for (int i : val) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
