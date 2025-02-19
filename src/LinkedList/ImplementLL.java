package LinkedList;

public class ImplementLL {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(12);

//        ll.display();
//        System.out.println(ll.size); // 5->8->12

        ll.insertAtBeginning(45);

//        ll.display();
//        System.out.println(ll.size); // 45->5->8->12

        ll.insertAt(0, 5);
//        ll.display();
        ll.insertAt(2, 10);
//        ll.display(); //5->45->10->5->8->12
        ll.insertAt(6, 17);
        ll.display(); //5->45->10->5->8->12->17
//        System.out.println(ll.tail.data);
//        System.out.println(ll.getAt(1));
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.tail.data);


    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static class LinkList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void deleteAt(int idx) {
            Node temp = head;
            if (idx==0){
                head=head.next;
                size--;
                return;
            }
            for (int i=0;i<(idx-1);i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }

        int getAt(int idx) {
            Node temp = head;
            if (idx < 0 || idx > size) {
                return -1;
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void insertAt(int idx, int data) {
            Node newNode = new Node(data);
            Node temp = head;
            if (idx < 0 || idx > size) {
                System.out.println("Enter valid Index");
                return;
            }
            if (idx == 0) {
                insertAtBeginning(data);
                return;
            }
            if (idx == size) {
                insertAtEnd(data);
                return;
            }
            for (int i = 1; i <= (idx - 1); i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        void insertAtBeginning(int data) {
            Node temp = new Node(data);
            if (head == null) { // if list is empty
                head = temp;
                tail = temp;
            } else { // if list is not empty
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) { // for empty list
                head = temp;
            } else { // if list is not empty
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
