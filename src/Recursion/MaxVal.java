package Recursion;

public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 3, 7};
        MaxVal mv = new MaxVal();
        int ans = mv.maxInArray(arr, 0);
        System.out.println("Max Value in the array is : " + ans);
    }

    public int maxInArray(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n - 1) {
            return arr[idx];
        }
        int smallAns = maxInArray(arr, idx + 1);
        return Math.max(smallAns, arr[idx]);
    }
}
