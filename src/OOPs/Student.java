package OOPs;

public class Student {
    String name;
    int rno;
    double percent;
    final String schoolName="SVM";
    private static int numberOfStudents;

    //Constructor
    public Student(){

    }
    public  Student(String name,int rno,double percent){
        this.name=name;
        this.rno=rno;
        this.percent=percent;
        numberOfStudents++;
    }
    public int getRno() { // getter
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }
    public static int getNumberOfStudents(){
        return numberOfStudents;
    }
}
