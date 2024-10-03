package Recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = pk.nextInt();
        PrintNTo1 pn = new PrintNTo1();
        if (num >= 1) {
            System.out.println("Natural numbers from n to 1 ");
            pn.printNatural(num);
        } else {
            System.out.println("Enter a valid input");
        }
    }

    void printNatural(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        printNatural(num - 1);
    }
}
