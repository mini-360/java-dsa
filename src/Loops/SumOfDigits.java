package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num = pk.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of the digits is : " + sum);
    }
}
