package Stacks;

import java.util.Stack;

/*
 * Next Greater Element
 * input array : 1 3 2 1  8  6 3  4
 * result      : 3 8 8 8 -1 -1 4 -1*/
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 2,1};
        int[] ans = nextGreater(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }

    }

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
}
