package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnList {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 2, 5};
        System.out.print("Enter target : ");
        int target = pk.nextInt();

        ReturnList rl = new ReturnList();
        ArrayList<Integer> ans = rl.returnList(arr, 0, target);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }


    }

    public ArrayList<Integer> returnList(int[] arr, int idx, int target) {
        int n = arr.length;
        if (idx >= n) {
            return new ArrayList<Integer>();  // It will return an empty ArrayList
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (target == arr[idx]) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = returnList(arr, idx + 1, target);
        ans.addAll(smallAns);
        return ans;
    }
}
