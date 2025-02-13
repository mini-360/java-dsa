package StringQuestions;

import java.util.Arrays;

public class CompressString2 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int ans = compress(chars);
        System.out.println(ans);
        for (char i : chars) {
            System.out.print(i + " ");
        }

    }

    public static int compress(char[] chars) {
        int count = 1;
        StringBuilder ans = new StringBuilder("");
        if (chars.length == 1) {
            return 1;
        }
        for (int i = 1; i < chars.length; i++) {
            char currChar = chars[i];
            char prevChar = chars[i - 1];
            if (currChar == prevChar) {
                count++;
            } else {
                ans.append(prevChar);
                if (count > 1) {
                    ans.append(count);
                }
                count = 1;
            }
        }
        ans.append(chars[chars.length-1]);
        if (count > 1) {
            ans.append(count);
        }
        int idx=0;
        for (int i=0;i<ans.length();i++){
            chars[idx++]=ans.charAt(i);
        }
        return ans.length();
    }
}
