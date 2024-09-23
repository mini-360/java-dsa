package Arrays2D;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the matrix : ");
        n = pk.nextInt();
        GenerateSpiralMatrix gsm = new GenerateSpiralMatrix();
        int[][] ans = gsm.generateSpiralMatrix(n);
        System.out.println("Generated Spiral Matrix");
        gsm.printMatrix(ans);
    }

    int[][] generateSpiralMatrix(int n) {
        int[][] ansArr = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int totalElement = 0, val = 1;
        while (totalElement < (n * n)) {
            for (int i = leftCol; i <= rightCol; i++) {
                ansArr[topRow][i] = val++;
                totalElement++;
            }
            topRow++;
            for (int j = topRow; j <= bottomRow; j++) {
                ansArr[j][rightCol] = val++;
                totalElement++;
            }
            rightCol--;
            for (int k = rightCol; k >= leftCol; k--) {
                ansArr[bottomRow][k] = val++;
                totalElement++;
            }
            bottomRow--;
            for (int l = bottomRow; l >= topRow; l--) {
                ansArr[l][leftCol] = val++;
                totalElement++;
            }
            leftCol++;
        }
        return ansArr;
    }

    void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
