package LinkedList;

public class LLBasics {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
//            this.next
        }
    }

    // Singly LinkedList
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5 3 9 8 16
        a.next = b;// 5->3 9 8 16
        b.next = c;// 5->3->9 8 16
        c.next = d;// 5->3->9->8 16
        d.next = e;// 5->3->9->8->16
        e.next = null; // 5->3->9->8->16->null

        display(a);
        insertAtEnd(a,87);
        display(a);
    }
    public static void insertAtEnd(Node head,int data){
        Node newNode=new Node(data);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
