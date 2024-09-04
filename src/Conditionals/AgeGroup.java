package Conditionals;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age = pk.nextInt();
        if (age <= 12) {
            System.out.println("Child");
        } else if (age > 12 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
}
