package ProblemsOnSorting;

public class Sort01And2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0, 1};
        System.out.println("Array before sorting : ");
        display(arr);

        sortZeroes(arr);
        System.out.println("Array after sorting : ");
        display(arr);
    }

    public static void sortZeroes(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
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
