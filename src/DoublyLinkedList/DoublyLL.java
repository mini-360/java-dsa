package DoublyLinkedList;

public class DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        displayHead(a);
//        displayFromTail(e);
//        displayFromAnywhere(c);
//        Node newHead=insertAtHead(a,35);
//        displayHead(newHead);
//        insertAtTail(a, 90);
        displayHead(a);
        insertAtIdx(a,3,56);
        displayHead(a);
    }

    public static void insertAtIdx(Node head, int idx, int data) {
        Node a = head;
        for (int i = 1; i <= idx - 1; i++) {
            a = a.next;
        }
        Node c = a.next;
        Node b = new Node(data);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
    }

    public static void insertAtTail(Node head, int val) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        newNode.prev = temp;
    }


    public static Node insertAtHead(Node head, int val) {
        Node t = new Node(val);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    // print from head to tail
    public static void displayFromAnywhere(Node random) {
        Node temp = random;
        // move this temp backward to head
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // print the list
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayFromTail(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayHead(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
