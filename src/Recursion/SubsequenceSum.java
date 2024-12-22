package Recursion;

import java.util.Scanner;

public class SubsequenceSum {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int[] arr = {2, 4, 5};

        SubsequenceSum ss = new SubsequenceSum();
        ss.subsetSum(arr, 0, 0);
    }

    public void subsetSum(int[] arr, int idx, int currSum) {
        int n = arr.length;
        if (idx >= n) {
            System.out.print(currSum + " ");
            return;
        }
        subsetSum(arr, idx + 1, currSum + arr[idx]);

        subsetSum(arr, idx + 1, currSum);
    }
}
