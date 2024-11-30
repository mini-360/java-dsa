package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter num1 : ");
        num1 = pk.nextInt();
        System.out.print("Enter num2 : ");
        num2 = pk.nextInt();

        GCD g1 = new GCD();
        int ans = g1.findGCD1(num1, num2);
        System.out.println("GCD is : " + ans);
        int ans1 = g1.findGCD2(num1, num2);
        System.out.println("GCD is : " + ans1);
    }

    public int findGCD1(int num1, int num2) {
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }

    public int findGCD2(int x, int y) {
        if (y == 0) {
            return x;
        }
        return findGCD2(y, x % y);
    }
}
