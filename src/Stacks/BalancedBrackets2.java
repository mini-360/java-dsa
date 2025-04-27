package Stacks;

import java.util.Scanner;
import java.util.Stack;

/*
 * Find the minimum number of brackets that we need to remove to make the given bracket sequence
 * balanced*/
public class BalancedBrackets2 {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter brackets : ");
        String str = pk.next();
        int ans = isBalanced(str);
        System.out.println("No. of brackets removed is : " + ans);
    }

    static int isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (ch == ')') {
                    if (!st.isEmpty()) {
                        st.pop();
                    } else {
                        count++;
                    }
                } else{
                    count++;
                }
            }
        }
        int size = st.size() + count;
        return size;
    }
}
