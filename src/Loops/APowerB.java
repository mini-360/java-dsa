package Loops;

import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num1, num2, power = 1;
        System.out.print("Enter num1 : ");
        num1 = pk.nextInt();
        System.out.print("Enter num2 : ");
        num2 = pk.nextInt();
        while (num2 > 0) {
            power *= num1;
            num2--;
        }
        System.out.println("A raised to the power B is : " + power);
    }
}
