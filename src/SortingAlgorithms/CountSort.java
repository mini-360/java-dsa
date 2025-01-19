package SortingAlgorithms;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        System.out.println("Array before sorting : ");
        display(arr);

        System.out.println();
        countSort(arr);
        System.out.println("Array after sorting : ");
        display(arr);


    }

    public static void countSort(int[] arr) {
        //find the largest element in the array
        int max = maxInArray(arr);
        int[] freqArr = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < freqArr.length; i++) {
            for (int j = 0; j < freqArr[i]; j++) {
                arr[k++] = i;
            }
        }

    }

    public static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
