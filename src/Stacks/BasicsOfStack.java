package Stacks;

import java.util.Stack;

public class BasicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(32);
        st.push(90);
        st.push(5);
        st.push(34);

        // peek
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("Size is : "+st.size());

        while (st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
