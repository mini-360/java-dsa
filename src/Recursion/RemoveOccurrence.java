package Recursion;

import java.util.Scanner;

public class RemoveOccurrence {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String str;
        System.out.print("Enter any string : ");
        str = pk.nextLine();


        RemoveOccurrence ro = new RemoveOccurrence();
        String ans = ro.removeA(str, 0);
        System.out.println("New String is : " + ans);

        String ans2 = ro.removeA2(str);
        System.out.println("New string is : " + ans2);
    }

    public String removeA(String str, int idx) {
        int n = str.length();
        if (idx == n) {
            return "";
        }
        char ch = str.charAt(idx);
        if (ch == 'a' || ch == 'A') {
            return removeA(str, idx + 1);
        } else {
            return ch + removeA(str, idx + 1);
        }
    }

    public String removeA2(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String smallAns = removeA2(s.substring(1));

        char ch = s.charAt(0);
        if (ch == 'a') {
            return smallAns;
        } else {
            return ch + smallAns;
        }
    }
}
