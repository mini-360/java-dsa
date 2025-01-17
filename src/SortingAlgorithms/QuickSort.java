package SortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 5, 4};

        QuickSort qs = new QuickSort();

        System.out.println("Array before sorting : ");
        qs.display(arr);

        System.out.println();

        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting : ");
        qs.display(arr);
    }

    public void quickSort(int[] arr, int st, int end) {
        if (st >= end) {
            return;
        }
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = st + count;
        swap(arr, st, pivotIndex);
        int i = st, j = end;


        // elements lesser or equal left of pivotIndex, greater -> right side of pivotIndex
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
