package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num, i = 1;
        System.out.print("Enter any number : ");
        num = pk.nextInt();
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
    }
}
