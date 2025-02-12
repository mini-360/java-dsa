package String;

public class StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
//        str.append("World");
        System.out.println(str);
        // hello->mello
//        str.setCharAt(0,'m');
        str.insert(2,"y");
        str.deleteCharAt(2);
        System.out.println(str);


        StringBuilder rev=new StringBuilder("physics");
        System.out.println(rev);
        rev.reverse();
        rev.reverse();
        //physics
        rev.delete(2,4);
        System.out.println(rev);
    }
}
