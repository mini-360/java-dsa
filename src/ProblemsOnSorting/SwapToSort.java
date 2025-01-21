package ProblemsOnSorting;

public class SwapToSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 7, 8, 9, 3};
        System.out.println("Array before sorting : ");
        display(arr);

        System.out.println();
        sortArray(arr);
        System.out.println("Array after sorting : ");
        display(arr);
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        swap(arr, x, y);
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
