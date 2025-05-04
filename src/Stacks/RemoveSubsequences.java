package Stacks;

/*
 * Given a sequence of numbers. Remove all the consecutive subsequences of length greater than or
 * equal to 2 that contains the same element*/

import java.util.Scanner;
import java.util.Stack;

public class RemoveSubsequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 7, 2};
        int[] ans = removeSubsequence(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }

    public static int[] removeSubsequence(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
