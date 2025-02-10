package SearchingQuestions;

public class DistributeChocolate {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        int m = 2;
        int ans = distributeChocolates(arr, m);
        System.out.println("No. of Chocolates is : " + ans);
    }

    public static int distributeChocolates(int[] arr, int m) {
        if (arr.length < m) {
            return -1;
        }
        int ans = 0;
        int st = 1, end = (int) 1e9;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isDivisionPossible(arr, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isDivisionPossible(int[] arr, int m, int maxChocolateAllowed) {
        int numOfStudents = 1;
        int choc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChocolateAllowed) {
                return false;
            }
            if (choc + arr[i] <= maxChocolateAllowed) {
                choc += arr[i];
            } else {
                numOfStudents++;
                choc = arr[i];
            }
        }
        if (numOfStudents > m) {
            return false;
        } else {
            return true;
        }
    }
}
