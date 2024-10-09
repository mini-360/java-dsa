package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = pk.nextInt();
        Factorial f = new Factorial();
        int ans = f.factorial(num);
        System.out.println("Factorial of " + num + " is : " + ans);
    }

    int factorial(int num) {
        if (num == 1) return num;
        return num * factorial(num - 1);
    }
}
