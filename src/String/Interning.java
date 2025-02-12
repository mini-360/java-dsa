package String;

public class Interning {
    public static void main(String[] args) {
        String s="Hello";
        String x="Hello";
//        System.out.println(s==x);
        x="Mello";
        System.out.println(x);


        String str1=new String("Hello");
    }
}
