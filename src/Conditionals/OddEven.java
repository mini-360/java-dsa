package Conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner pk=new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num=pk.nextInt();
        if (num%2==0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }
}
