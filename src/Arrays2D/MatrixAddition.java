package Arrays2D;

import java.util.Scanner;

public class MatrixAddition {
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
        int[][] arr2 = new int[r1][c1];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = pk.nextInt();
            }
        }
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input addition not possible");
            return;
        }
        MatrixAddition ma = new MatrixAddition();
        int[][] sum = ma.addMatrix(arr1, r1, c1, arr2, r2, c2);
        System.out.println("Matrix after addition : ");
        ma.printArray(sum);
    }

    int[][] addMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
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
