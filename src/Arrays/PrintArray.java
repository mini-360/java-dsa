package Arrays;

class Print{
    void print2DArray(){
        int[][] arr={{56,57,58},{32,33,34},{10,11,12}};
        for(int[] num:arr){
            for(int val:num){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

public class PrintArray {
    public static void main(String[] args) {
        Print obj=new Print();
        obj.print2DArray();
    }
}
