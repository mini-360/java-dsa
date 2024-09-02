package VariablesInputOutput;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t;
        Scanner pk=new Scanner(System.in);
        System.out.print("enter principle amount : ");
        p=pk.nextFloat();
        System.out.print("Enter rate : ");
        r=pk.nextFloat();
        System.out.print("Enter time : ");
        t=pk.nextFloat();
        float interest=(p*r*t)/100;
        System.out.println("Principle : "+p);
        System.out.println("Rate : "+r);
        System.out.println("Time : "+t);
        System.out.println("Simple interest is : "+interest);
    }
}
