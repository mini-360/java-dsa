package Recursion;

import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = pk.nextLine();

        PrintSubSequence ps = new PrintSubSequence();
        ps.genSubsequence(str, "");

    }

    public void genSubsequence(String str, String currAns) {
        if (str.isEmpty()) {
            System.out.print(currAns + " ");
            return;
        }
        char currChar = str.charAt(0);
        String remString = str.substring(1); 

        genSubsequence(remString, currAns + currChar);

        genSubsequence(remString, currAns);
    }
}
