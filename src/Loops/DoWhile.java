package Loops;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner pk=new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num=pk.nextInt();
        int sum=0;
        do {
            sum+=num;
            num= pk.nextInt();
        }while(num!=-1);
//        while (num!=-1){
//            sum+=num;
//            num= pk.nextInt();
//        }
        System.out.println(sum);
    }
}
