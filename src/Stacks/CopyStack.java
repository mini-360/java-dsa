package Stacks;

import java.util.Scanner;
import java.util.Stack;

// Copy contents of one stack to another in same order
public class CopyStack {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the no elements : ");
        int n = pk.nextInt();
        System.out.println("Enter elements you want to insert : ");
        for (int i = 0; i < n; i++) {
            int x = pk.nextInt();
            st.push(x);
        }
        System.out.println(st);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while (!st.isEmpty()) {
            int el = st.pop();
            rt.push(el);

        }
        System.out.println(rt);
        while (!rt.isEmpty()){
            int el=rt.pop();
            st.push(el);
        }
        System.out.println(st);
        pk.close();
    }
}
