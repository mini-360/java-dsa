package Stacks;

import java.util.Stack;

public class InsertInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx=2;
        int val=7;
        Stack<Integer> temp=new Stack<>();
        while (st.size()>idx){
            int stVal=st.pop();
            temp.push(stVal);
        }
        st.push(val);
        while (!temp.isEmpty()){
            int tempVal=temp.pop();
            st.push(tempVal);
        }
        System.out.println(st);
    }
}
