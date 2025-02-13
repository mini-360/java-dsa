package StringQuestions;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = pk.nextLine();
        String ans = reverseEachWord(str);
        System.out.println(ans);
    }

    public static String reverseEachWord(String str) {
        StringBuilder sb = new StringBuilder("");
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
//                sb.delete(0,sb.length()+1);
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }
}
