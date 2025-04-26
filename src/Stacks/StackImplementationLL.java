package Stacks;

public class StackImplementationLL {
    public static class Node { // user defined datatype
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LLStack { // user defined data structure
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
            return;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            return top;
        }

        void displayRec(Node disTemp) {
            if (disTemp == null) {
                return;
            }
            displayRec(disTemp.next);
            System.out.print(disTemp.data + " ");
        }

        void display() {
            displayRec(head);
            System.out.println();
        }

        void displayReverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
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
