package OOPs;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhay";
        s1.percent = 75.2;
        s1.setRno(14);
        System.out.println(s1.getRno());
    }

    public static void fun(Student x) {
        System.out.println(x.name);
    }

    public static void change(Student x) {
        x.name = "Rohit";
    }
}
