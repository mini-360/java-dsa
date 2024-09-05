package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter value of num : ");
        num = pk.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum is : " + sum);
    }
}
