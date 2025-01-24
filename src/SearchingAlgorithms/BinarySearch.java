package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 77};
        int target = 0;

        boolean ans = binarySearchLoop(arr, target);
        if (ans) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element not Found");
        }
        boolean ans1 = binarySearchRecursion(arr, target, 0, arr.length - 1);
        if (ans1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }


    }

    //  Using for loop
    public static boolean binarySearchLoop(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return false;
    }

    //    Using recursion
    public static boolean binarySearchRecursion(int[] arr, int target, int st, int end) {
        if (st > end) {
            return false;
        }
        int mid = (st + end) / 2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return binarySearchRecursion(arr, target, st, mid - 1);
        } else {
            return binarySearchRecursion(arr, target, mid + 1, end);
        }
    }
}
