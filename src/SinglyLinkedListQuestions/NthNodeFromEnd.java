package SinglyLinkedListQuestions;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(200);
        Node c=new Node(300);
        Node d=new Node(400);
        Node e=new Node(500);
        Node f=new Node(600);
        a.next=b;
        b.next=null;
        c.next=null;
        d.next=e;
        e.next=f;

        Node temp=getNode1(a,1);
//        System.out.println(temp.data);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node getNode1(Node head,int nth){
       int size=0;
       if (nth<=2){
           if (nth==0){
               return null;
           } else if (nth==1) {
               return head;
           }else{
               int newSize=size-nth;
               Node newNode=head;
               for (int i=0;i<newSize;i++){
                   newNode=newNode.next;
               }
               return newNode;
           }
       }
       Node temp=head;
       while (temp!=null){
           size++;
           temp=temp.next;
       }
       int fromStart=size-nth+1;
       Node newTemp=head;
       for (int i=0;i<(fromStart-1);i++){
           newTemp=newTemp.next;
       }
       return newTemp;
    }
}
