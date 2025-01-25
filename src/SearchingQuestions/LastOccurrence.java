package SearchingQuestions;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 6, 6, 7, 8, 9};
        int target = 5;
        int ans = lastOccurrence(arr, target);
        if (ans >= 0) {
            System.out.println("First occurrence of " + target + " is at " + ans);
        } else {
            System.out.println("No occurrence is found");
        }
    }

    public static int lastOccurrence(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int idx = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                idx = mid;
                st = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return idx;
    }
}
