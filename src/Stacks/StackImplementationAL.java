package Stacks;

import java.util.ArrayList;

public class StackImplementationAL {
    public static class ALStack{
        ArrayList<Integer> st=new ArrayList<>();
        void push(int x){
            st.add(x);
        }
        int pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=st.get(st.size()-1);
            st.remove(st.size()-1);
            return top;
        }
        int peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=st.get(st.size()-1);
            return top;
        }
        void display(){
            for (int i=0;i<st.size();i++){
                System.out.print(st.get(i)+" ");
            }
            System.out.println();
        }
        int size(){
            return st.size();
        }
        boolean isEmpty(){
            if (st.size()==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        ALStack st = new ALStack();
        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 4 5
        System.out.println(st.size()); // 2
        st.push(7);
        st.push(3);
        st.display(); // 4 5 7 3
        st.push(22);
        st.display(); // 4 5 7 3 22
    }
}
