package LinkedLists;

import java.util.Scanner;
public class ReverseLLBetter {

    public static DoubleNode ReverseLLbetter(Node<Integer>head){
        if (head==null || head.next==null){
            DoubleNode ans= new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode smallAns= ReverseLLbetter(head.next);
        smallAns.tail.next= head;
        head.next= null;

        DoubleNode ans= new DoubleNode();
        ans.head= smallAns.head;
        ans.tail= head;
        return ans;
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
            Node<Integer> head= takeInput();
            DoubleNode ans= ReverseLLbetter(head);
            print(ans.head);

    }

}
class DoubleNode {
    Node <Integer> head;
    Node<Integer> tail;
}
