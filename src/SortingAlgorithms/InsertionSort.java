package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 4, 2};
        System.out.println("Unsorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                //swap arr[j] and arr[j-1]
                swap(arr, j, j - 1); 
                j--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
