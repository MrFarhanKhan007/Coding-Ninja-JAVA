package LinkedLists;

public class LinkedListUse2 {
    public static void print(Node<Integer>head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> n1= new Node<>(10);
        Node<Integer> n2= new Node<>(20);
        Node<Integer> n3= new Node<>(30);
        n1.next=n2;
        n2.next=n3;
        Node <Integer> head= n1;
        print(head);
        print(head);
    }
}
