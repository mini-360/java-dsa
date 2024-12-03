package Recursion;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};

        ArrayRecursion ar = new ArrayRecursion();
        ar.printArray(arr, 0);
    }

    public void printArray(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n) {
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }
}
