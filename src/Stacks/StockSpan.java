package Stacks;

import java.util.Stack;

public class StockSpan {
    public static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = previousGreater(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }

    public static int[] previousGreater(int[] arr) {
        int n = arr.length;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(100, 0));
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek().first < arr[i]) {
                st.pop();
            }
            res[i] = i - st.peek().second;
            st.push(new Pair(arr[i], i));
        }
        return res;
    }
}
