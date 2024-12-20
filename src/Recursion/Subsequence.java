package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String str;
        System.out.print("Enter any String : ");
        str = pk.nextLine();

        Subsequence sq = new Subsequence();
        ArrayList<String> ans = sq.getSubsequence(str);

        for (String st : ans) {
            System.out.print(st + " ");
        }
    }

    public ArrayList<String> getSubsequence(String str) {
        ArrayList<String> ans = new ArrayList<>();
        // if(s.length()==0)
        if (str.isEmpty()) {
            ans.add("");
            return ans;
        }

        char currChar = str.charAt(0);
        ArrayList<String> smallAns = getSubsequence(str.substring(1));

        for (String st : smallAns) {
            ans.add(st);
            ans.add(currChar + st);
        }
        return ans;

    }
}
