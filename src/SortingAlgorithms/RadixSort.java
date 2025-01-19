package SortingAlgorithms;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        System.out.println("Array before sorting : ");
        display(arr);

        System.out.println();
 
        radixSort(arr);
        System.out.println("Array after sorting : ");
        display(arr);
    }

    public static void radixSort(int[] arr) {
        int max = maxInArray(arr); // get maximum element
        // apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }


    }

    public static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] freqArr = new int[10];
        for (int val : arr) {
            int digit = (val / place) % 10;
            freqArr[digit]++;
        }
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            int idx = freqArr[digit] - 1;
            output[idx] = arr[i];
            freqArr[digit]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
