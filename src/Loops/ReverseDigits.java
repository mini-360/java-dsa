package Loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num, revNum = 0;
        System.out.print("Enter any number : ");
        num = pk.nextInt();
        if (num < 10) {
            System.out.println("Reverse Number is : " + num);
        } else {
            while (num > 0) {
                int rem = num % 10;
                revNum = (revNum * 10) + rem;
                num = num / 10;
            }
        }
        System.out.println("Reverse number is : " + revNum);
        pk.close();
    }
}
