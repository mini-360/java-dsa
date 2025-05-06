package Queue;

/* Linked List implementation of queue*/
public class QueueImplementationLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public int remove() {
            if (head == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int topVal = head.data;
            head = head.next;
            size--;
            return topVal;
        }

        public void display() {
            Node temp = head;
            if (temp == null) {
                System.out.println("Queue is empty");
                return;
            }
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty() {
//            if (size == 0) return true;
//            return false;
            return size == 0;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(11);
        q.add(13);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
        System.out.println(q.isEmpty());
    }
}
