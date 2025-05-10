package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q); // 1 2 3 4 5 6 7 8

        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for (int i=1;i<=n/2;i++){
            st.push(q.remove()); // st -> 4 3 2 1
        } // q -> 5 6 7 8
        while (!st.isEmpty()){
            q.add(st.pop()); // q -> 5 6 7 8 4 3 2 1
        }
        for (int i=1;i<=n/2;i++){
            st.push(q.remove()); // st -> 8 7 6 5
        } // q -> 4 3 2 1
        for (int i=1;i<=n/2;i++){
            // one by one, pahle stack se phir queue se
            q.add(st.pop());
            q.add(q.remove());
        }
        // q -> 8 4 7 3 6 2 5 1
        while (!q.isEmpty()){
            st.push(q.remove());
        } // st -> 1 5 2 6 3 7 4 8
        while (!st.isEmpty()){
            q.add(st.pop());
        } // q -> 1 5 2 6 3 7 4 8
        System.out.println(q);

    }
}
