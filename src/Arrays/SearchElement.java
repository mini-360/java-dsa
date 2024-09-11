package Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        SearchElement obj = new SearchElement();
        int target;
        System.out.print("Enter target value : ");
        target = pk.nextInt();
        int ans = obj.searchAndReturn(arr, target);
        System.out.println("Element found at index : " + ans);
    }

    int searchAndReturn(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
