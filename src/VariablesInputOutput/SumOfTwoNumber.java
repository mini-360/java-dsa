package VariablesInputOutput;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner pk=new Scanner(System.in);
        System.out.println("Enter num1 : ");
        num1= pk.nextInt();
        System.out.println("Enter num2 : ");
        num2=pk.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is : "+sum);
    }
}
