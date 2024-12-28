package Recursion;

import java.util.Scanner;

public class LetterCombinations {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String[] keyCode = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        System.out.print("Enter any String : ");
        String digits = pk.nextLine();


        LetterCombinations lc = new LetterCombinations();
        lc.stringCombinations(digits, keyCode, "");
    }

    public void stringCombinations(String digits, String[] keyCode, String res) {
        if (digits.isEmpty()) {
            System.out.print(res + " ");
            return;
        }

        int currNum = digits.charAt(0) - '0';
        String currChoices = keyCode[currNum];

        for (int i = 0; i < currChoices.length(); i++) {
            stringCombinations(digits.substring(1), keyCode, res + currChoices.charAt(i));
        }

    }
}
