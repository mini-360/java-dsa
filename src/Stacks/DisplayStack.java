package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
    }

    public static void display(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int ele = st.pop();
        System.out.print(ele + " ");
        display(st);
        st.push(ele);
    }
}
