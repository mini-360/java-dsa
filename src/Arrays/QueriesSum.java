package Arrays;

import java.util.Scanner;

public class QueriesSum {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int size, q;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter elements in the array : ");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        System.out.print("Enter no. of queries : ");
        q = pk.nextInt();
        QueriesSum qs = new QueriesSum();
        qs.querySum(arr, q);
    }


    void querySum(int[] arr, int q) {
        Scanner sc = new Scanner(System.in);
        int[] ans = prefixSum(arr);
        while (q-- > 0) {
            System.out.println("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = ans[r] - ans[l - 1];
            System.out.println("Sum is : " + sum);
        }
    }

    int[] prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
}
