package Loops;

import java.util.Scanner;

public class InvertedTriangularPattern {
    public static void main(String[] args) {
        int row;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = pk.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row-i+1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
