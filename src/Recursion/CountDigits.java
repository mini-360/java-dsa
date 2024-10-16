package Recursion;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = pk.nextInt();
        CountDigits cd = new CountDigits();
        int ans = cd.countDigits(num);
        System.out.println("Number of digits is : " + ans);
    }

    int countDigits(int num) {
        if (num < 0) num = -num;
        if (num >= 0 && num <= 9) return 1;
        return 1 + countDigits(num / 10);
    }
}
