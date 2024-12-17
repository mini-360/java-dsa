package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter any String to reverse : ");
        String str = pk.nextLine();
        ReverseString rs = new ReverseString();
        String ans = rs.reverseString(str, 0);
        System.out.println("Reversed string is : " + ans);


        String ans1 = rs.reverseString2(str);
        System.out.println("Reversed String is : " + ans1);
    }

    public String reverseString(String str, int idx) {
        int n = str.length();
        if (idx == n) {
            return "";
        }
        String smallAns = reverseString(str, idx + 1);
        char ch = str.charAt(idx);
        return smallAns + ch;
    }

    public String reverseString2(String str) {
        if (str.isEmpty()) return "";

        String smallAns = reverseString2(str.substring(1));
        char ch = str.charAt(0);
        return smallAns + ch;
    }
}
