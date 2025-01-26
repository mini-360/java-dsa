package SearchingQuestions;

import java.util.Scanner;

public class RotatedSortedTarget {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};

        Scanner pk = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = pk.nextInt();
        int targetIdx = findTarget(arr, target);
        if (targetIdx >= 0) {
            System.out.println("Target found at index : " + targetIdx);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int findTarget(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[end]) {
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}
