package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String str;
        System.out.print("Enter any string : ");
        str = pk.nextLine();


        Palindrome pl = new Palindrome();

        String ans = pl.reverseString(str, 0);

        if (str.equalsIgnoreCase(ans)) {
            System.out.printf("%s is a Palindrome", str);
        } else {
            System.out.printf("%s Not a Palindrome", str);
        }

        System.out.println();

        boolean ans1 = pl.isPalindrome(str, 0, str.length() - 1);
        if (ans1) {
            System.out.printf("%s is a Palindrome", str);
        } else {
            System.out.printf("%s Not a Palindrome", str);
        }


    }

    public String reverseString(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }
        String smallAns = reverseString(str, idx + 1);
        char ch = str.charAt(idx);
        return smallAns + ch;
    }

    public boolean isPalindrome(String str, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }
        return isPalindrome(str, l + 1, r - 1);
    }
}
