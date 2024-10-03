package Recursion;

import java.util.Scanner;

public class PrintNatural {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = pk.nextInt();
        PrintNatural pn = new PrintNatural();
        pn.printNatural(num);
    }

    void printNatural(int num) {
        if (num == 0) return;
        printNatural(num - 1);
        System.out.print(num + " ");
    }
}
