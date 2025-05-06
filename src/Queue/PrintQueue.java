package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
* Print all the elements present in given queue only using add(),
* remove(),peek(),size(),and extra queue*/
public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);

        Queue<Integer> helper=new LinkedList<>();
        while (!q.isEmpty()){
            helper.add(q.peek());
            System.out.print(q.remove()+" ");
        }
        System.out.println();
        System.out.println(helper);
        while (!helper.isEmpty()){
            q.add(helper.remove());
        }
        System.out.println(q);
    }
}
