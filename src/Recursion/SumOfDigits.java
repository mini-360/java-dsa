package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = pk.nextInt();
        SumOfDigits sod = new SumOfDigits();
        int ans = sod.digitSum(num);
        System.out.println("Sum of digits of " + num + " is : " + ans);

    }

    int digitSum(int num) {
        if (num >= 0 && num <= 9) return num;
        return (num % 10) + digitSum(num / 10);
    }
}
