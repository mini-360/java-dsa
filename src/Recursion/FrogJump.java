package Recursion;


public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};

        FrogJump fj = new FrogJump();

        int ans = fj.minCost(arr, 0);
        System.out.println("Min Cost is : " + ans);

    }

    public int minCost(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n - 1) {
            return 0;
        }


        int op1 = Math.abs(arr[idx] - arr[idx + 1]) + minCost(arr, idx + 1);

        if (idx == n - 2) {
            return op1;
        }


        int op2 = Math.abs(arr[idx] - arr[idx + 2]) + minCost(arr, idx + 2);

        return Math.min(op1, op2);

    }
}
