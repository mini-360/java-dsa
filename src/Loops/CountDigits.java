package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num = pk.nextInt();
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Total no. of digits is : " + count);
    }
}
