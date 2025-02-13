package StringQuestions;

import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = pk.nextLine();
        int ans = countPalindrome(str);
        System.out.println("No. of Palindromic Substring is : " + ans);
    }
    // This function will increase the count after checking each substring
    public static int countPalindrome(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String tempStr = str.substring(i, j);
                if (checkPalindrome(tempStr)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Checking whether a String is Palindrome or not
    public static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
