package Arrays2D;

import java.util.Scanner;

public class TakingInput {
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
        TakingInput ti = new TakingInput();
        ti.printArray(arr);
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
