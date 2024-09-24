package Arrays2D;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        int l1, r1, l2, r2, row, col;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row and col : ");
        row = pk.nextInt();
        col = pk.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements in the matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = pk.nextInt();
            }
        }
        System.out.print("Enter l1 r1 l2 r2 : ");
        l1 = pk.nextInt();
        r1 = pk.nextInt();
        l2 = pk.nextInt();
        r2 = pk.nextInt();
        MatrixSum ms = new MatrixSum();
//        int ans = ms.findSum(arr, l1, r1, l2, r2);
//        int ans = ms.findSumMethod2(arr, l1, r1, l2, r2);
        int ans = ms.findSumMethod3(arr, l1, r1, l2, r2);
        System.out.println("Sum is : " + ans);

    }

    // Method - 1 : Brute force method
    int findSum(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = l1; j <= l2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Method - 2 : Pre-Calculating horizontal sum for each row in the matrix
    int findSumMethod2(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumRow(arr);

        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) sum += arr[i][r2] - arr[i][r1 - 1];
            else sum += arr[i][r2];
        }
        return sum;
    }

    // Method - 3 : Prefix sum Over columns and rows Both
    int findSumMethod3(int[][] arr, int l1, int r1, int l2, int r2) {
        int ans = 0;
        findPrefixSumRow(arr);
        prefixSumColumn(arr);
        int sum = 0, up = 0, left = 0, leftUp = 0;

        sum = arr[l2][r2];
        if (r1 >= 1) left = arr[l2][r1 - 1];
        if (l1 >= 1) up = arr[l1 - 1][r2];
        if (l1 >= 1 && r1 >= 1) leftUp = arr[l1 - 1][r1 - 1];

        ans = sum - up - left + leftUp;
        return ans;

    }

    void findPrefixSumRow(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    void prefixSumColumn(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }
}
