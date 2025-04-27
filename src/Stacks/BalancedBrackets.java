package Stacks;
/*
* Check Whether a given bracket sequence is balanced or not*/
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter the brackets : ");
        String str = pk.next();
        boolean ans = balancedStack(str);
        if (ans) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    static boolean balancedStack(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}
