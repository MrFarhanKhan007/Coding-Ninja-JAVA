public class Solution {

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        LinkedListNode<Integer> tail=head.next;
        LinkedListNode<Integer> smallhead=reverseLinkedListRec(head.next);
        tail.next=head;
        head.next=null;
        return smallhead;


}
}
//or
