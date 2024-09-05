package Loops;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num, i = 1, sum = 0;
        System.out.print("enter value of num : ");
        num = pk.nextInt();
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum is : " + sum);
    }
}
