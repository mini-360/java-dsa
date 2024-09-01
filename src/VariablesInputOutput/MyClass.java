package VariablesInputOutput;

public class MyClass {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Arguments passed");
        } else {
            System.out.println("Argument not passed");
        }
    }
}
