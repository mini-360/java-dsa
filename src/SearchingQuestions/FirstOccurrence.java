package SearchingQuestions;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 6, 6, 7, 8, 9};
        int target = 9;
        int ans = firstOccurrence(arr, target);
        if (ans >= 0) {
            System.out.println("First occurrence of " + target + " is at " + ans);
        } else {
            System.out.println("No occurrence is found");
        }
    }

    public static int firstOccurrence(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int idx = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                idx = mid;
                end=mid-1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return idx;
    }
}
