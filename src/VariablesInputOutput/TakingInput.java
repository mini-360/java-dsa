package VariablesInputOutput;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        String name;
        int age;
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter your name : ");
        name=pk.nextLine();
        System.out.print("Enter your age : ");
        age=pk.nextInt();
        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
    }
}
