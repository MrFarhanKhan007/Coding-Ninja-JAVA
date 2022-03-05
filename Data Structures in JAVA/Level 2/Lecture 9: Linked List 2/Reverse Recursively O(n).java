package LinkedLists;

import java.util.Scanner;

public class ReverseLL3 {
    public static Node<Integer> ReverseRLL3(Node<Integer> head){
        if (head==null || head.next==null){
            return head;
        }

        Node<Integer> Reversedtail= head.next;
        Node<Integer> smallHead=ReverseRLL3(head.next);
        Reversedtail.next=head;
        head.next=null;
        return smallHead;
    }

    public static void print(Node<Integer> head){

        while (head!= null){
            System.out.print(head.data+" ");
            head= head.next;
        }
        System.out.println();

    }
    public static Node<Integer> takeInput(){
        Node<Integer>head=null;
        Node<Integer> tail=null;
        Scanner scanner= new Scanner(System.in);
        int data= scanner.nextInt();

        while (data!=-1){
            Node<Integer> NewNode= new Node<>(data);
            if (head==null){
                head= NewNode;
                tail= NewNode;
            }
            else {
                tail.next= NewNode;
                tail= NewNode;
            }
            data= scanner.nextInt();
        }
        return head;
    }
    public static void main(String[] args) {
        Node <Integer> head=takeInput();
        head=ReverseRLL3(head);
        print(head);

    }
}
class DoubleNode {
    Node <Integer> head;
    Node<Integer> tail;
}
