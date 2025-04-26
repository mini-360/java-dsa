package SinglyLinkedListQuestions;

public class DeleteFromEnd {
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
        Node f=new Node(600);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        System.out.println(size(a));
        Node ans=removeNthFromEnd(a,2);
        System.out.println(size(a));
        display(ans);
        System.out.println(ans.data);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int size(Node head){
        int count=0;
        Node temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static Node removeNthFromEnd(Node head, int n) {
        int size = size(head);
        int newSize = size - n;

        // If we need to remove the first node (n == size)
        if (newSize == 0) {
            return head.next;
        }

        Node temp = head;
        for (int i = 0; i < newSize - 1; i++) {
            temp = temp.next;
        }

        // Remove the nth node
        temp.next = temp.next.next;

        return head;  // Return the modified list
    }

}
