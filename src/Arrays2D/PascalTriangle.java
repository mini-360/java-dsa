package Arrays2D;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int row;
        System.out.print("Enter row : ");
        row = pk.nextInt();
        PascalTriangle pt = new PascalTriangle();
        int[][] ans = pt.pascalTriangle(row);
        System.out.println("Pascal Triangle ");
        pt.printArray(ans);
    }

    int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
                }
            }
        }
        return ans;
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
