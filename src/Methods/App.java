package Methods;

public class App {
    public String str1 = "I am a public member";

    void printFromClass(){
        System.out.println("Within Class "+str1);
    }
    public static void main(String[] args) {
        App obj=new App();
        obj.printFromClass();
        System.out.println("Within Class "+obj.str1);

        App2 obj1=new App2();
        obj1.printFromOutsideClass();
    }
}

class App2 {
    void printFromOutsideClass(){
        App obj1=new App();
        System.out.println("Within package but outside class"+obj1.str1);
    }
}
