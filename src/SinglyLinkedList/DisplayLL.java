package SinglyLinkedList;

public class DisplayLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

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

        displayIterative(a);
        System.out.println();
        displayRecursively(a);
        int ans=size(a);
        System.out.println();
        System.out.println(ans);
    }

    public static void displayIterative(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayRecursively(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " ");
        displayRecursively(temp.next);
    }

    public static int size(Node head){
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

}
