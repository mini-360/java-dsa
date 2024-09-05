package Loops;

import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter any number : ");
        num = pk.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
        pk.close();
    }
}
