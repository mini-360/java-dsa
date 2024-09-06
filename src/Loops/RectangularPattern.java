package Loops;
import java.util.Scanner;
public class RectangularPattern {
    public static void main(String[] args) {
        int r,c;
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter row : ");
        r=pk.nextInt();
        System.out.print("Enter column : ");
        c=pk.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
