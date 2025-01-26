package SearchingQuestions;

public class RotatedSortedSearchMax {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 1, 2};
        int max = searchMaxInRotatedSorted(arr);
        System.out.println("Max element in the given array is : " + max);
    }

    public static int searchMaxInRotatedSorted(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] >= arr[n - 1]) {
                ans = arr[mid];
                st = mid + 1;
            } else if (arr[mid] < arr[n - 1]) {
                end = mid - 1;
            }
        }
        return ans;
    }
}
