package Recursion;

import java.util.Scanner;

public class KMultiples {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num, k;
        System.out.print("Enter value of num : ");
        num = pk.nextInt();
        System.out.print("Enter value of k : ");
        k = pk.nextInt();
        kMultiples(num, k);
    }

    static void kMultiples(int num, int k) {
        if (k == 1) {
            System.out.print(num + " ");
            return;
        }
        kMultiples(num, k - 1);
        System.out.print(num * k + " ");
    }
}
