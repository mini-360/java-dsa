package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        q.add(18);
//        q.add(19);
//        q.add(21);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        int n;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter the target from where you want to reverse : ");
        n = pk.nextInt();
        while (q.size() >= n) {
            st.push(q.remove());
        }
        for (int i = 0; i < n; i++) {
            q.add(st.pop());
        }
        for (int i = 0; i < q.size() - n; i++) {
            int val = q.remove();
            q.add(val);
        }
        System.out.println(q);
    }
}
