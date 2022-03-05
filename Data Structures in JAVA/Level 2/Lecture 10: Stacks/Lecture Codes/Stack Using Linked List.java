package Stacks;
public class StackUsingLL {

    private Node head;
    private static int size;


    public StackUsingLL() {
        head=null;
        size=0;
    }

    public int getSize() {

        return size;
    }

    public static boolean isEmpty() {
               return size==0;
    }

    public void push(int element) {

        Node newNode=new Node(element);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        size=size+1;
    }

    public int pop() {

        if (head==null)
        {
            size=0;
            return -1;
        }
        else
        {
            size=size-1;
            int topEle= (int) head.data;
            head=head.next;
            return topEle;
        }


    }

    public int top() {
        //Implement the top() function
        if (head==null)
        {
            return -1;
        }
        else
        {
            return (int) head.data;
        }

    }
}
