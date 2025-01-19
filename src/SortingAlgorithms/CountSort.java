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
        System.out.println();
        optimizedCountSort(arr);
        display(arr);


    }
    // Optimized count sort

    public static void optimizedCountSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = maxInArray(arr); // find the largest element of the arr
        int[] freqArr = new int[max + 1];
        for (int val : arr) { // Make frequency array
            freqArr[val]++;
        }
        // Make prefix sum array of freqArr
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i - 1];
        }

        // Find the index of each element in the original array and put it in output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = freqArr[arr[i]] - 1;
            output[idx] = arr[i];
            freqArr[arr[i]]--;
        }

        // Copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
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
