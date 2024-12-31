package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 1, 2, 100, 90};

        System.out.println("Unsorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);

        System.out.println("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the current index
            // finding the minimum element in unsorted part of array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap current element and minimum element
            // arr[minIndex arr[i]
            if (minIndex != i) {
                swap(arr, minIndex, i);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
