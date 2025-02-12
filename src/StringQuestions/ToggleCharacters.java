package StringQuestions;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = pk.nextLine();
        String ans = toggleCharacter(str);
        System.out.println("Toggled String is : " + ans);

        System.out.print("Enter string for StringBuilder : ");
        StringBuilder sb = new StringBuilder(pk.nextLine());
        StringBuilder ansSB = toggleChar(sb);
        System.out.println("Toggled Character using String Builder : " + ansSB);

    }

    // Using StringBuilder
    public static StringBuilder toggleChar(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                char newChar = (char) ascii;
                str.setCharAt(i, newChar);
            } else {
                ascii -= 32;
                char newChar = (char) ascii;
                str.setCharAt(i, newChar);
            }
        }
        return str;
    }

    //Using String
    public static String toggleCharacter(String str) {
        String st = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                st += ' ';
            }
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) {
                ascii = ascii + 32;
                char newChar = (char) ascii;
                st += newChar;
            } else {
                ascii = ascii - 32;
                char newChar = (char) ascii;
                st += newChar;
            }
        }
        return st;
    }
}
