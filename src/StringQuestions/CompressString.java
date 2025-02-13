package StringQuestions;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = pk.next();
        String ans = compress(str);
        System.out.println("Compressed string is : " + ans);
    }

    public static String compress(String str) {
        int count = 1;
        StringBuilder ans = new StringBuilder("");
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i - 1);
            if (ch == ch1) {
                count++;
            } else {
                ans.append(ch1);
                if (count > 1) {
                    ans.append(count);
                }
                count = 1;
            }
        }
        ans.append(str.charAt(str.length() - 1));
        if (count > 1) {
            ans.append(count);
        }
        return ans.toString();
    }


}
