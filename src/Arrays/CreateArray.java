package Arrays;

class ArraysExample {
    void demoArrays() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];
        ages[0] = 34;
        ages[1] = 22;
        ages[2] = 25;

        weights[0] = 23.8f;
        weights[1] = 52.5f;
        weights[2] = 88.1f;

        names[0] = "Rohit";
        names[1] = "Sharma";
        names[2] = "Hitman";


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}

public class CreateArray {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
    }
}
