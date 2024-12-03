package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 20, 1};
        SumOfArray soa = new SumOfArray();
        int ans = soa.sum(arr, 0);
        System.out.println("Sum of array is : " + ans);
    }

    public int sum(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n) {
            return 0;
        }
//        return arr[idx] + sum(arr, idx + 1);
        int smallAns=sum(arr,idx+1);
        return arr[idx]+smallAns;
    }
}
