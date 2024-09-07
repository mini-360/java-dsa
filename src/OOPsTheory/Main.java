package OOPsTheory;

class Student {
    int rollNo;
    String studName;
}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo=1;
        obj1.studName="Abhay";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studName);


        Student obj2=new Student();
        obj2.rollNo=5;
        obj2.studName="Rohan";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studName);

    }
}
