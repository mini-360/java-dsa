package ProblemsOnSorting;

public class SortPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-13, 20, 7, 0, -4, -13, 11, -5, -13};
        System.out.println("Array before positive negative sorting : ");
        display(arr);

        partition(arr);
        System.out.println("Array after positive negative sorting : ");
        display(arr);
    }

    public static void partition(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] < 0) {
                l++;
            }
            while (arr[r] >= 0) {
                r--;
            }
            if (l < r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
