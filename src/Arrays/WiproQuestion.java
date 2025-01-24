package Arrays;

public class WiproQuestion {
    public static void main(String[] args) {
        int[] arr = {-13, -15, 13, 19, 18, 14, -5, -11, -13, -32, -33, -5, -1, -77, 78, -79};
        System.out.println(longestSubsequence(arr));
    }

    public static int longestSubsequence(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
