package OOPs;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Abhay Raj",21,75.2);
        System.out.println(Student.getNumberOfStudents());
        Student s2=new Student("Rohit",45,75);
        System.out.println(Student.getNumberOfStudents());


    }

    public static void change(Student x) {
        x.name = "Rohit";
    }
}
