package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3, 6, 0};
        int n = arr.length;
        System.out.println("Array before sorting : ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println();
        System.out.println("Array after sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // last i elements are already at correct sorted position so no need to check them
                if (arr[j] > arr[j + 1]) {
                    // we need to swap arr[j] arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
