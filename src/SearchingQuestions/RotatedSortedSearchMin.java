package SearchingQuestions;

public class RotatedSortedSearchMin {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int ans = searchInArray(arr);
        System.out.print("Minimum element in array is : " + ans);
    }

    public static int searchInArray(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[n - 1]) {
                st = mid + 1;
            } else if (arr[mid] <= arr[n - 1]) {
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}
