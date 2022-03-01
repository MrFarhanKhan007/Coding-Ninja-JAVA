public class Solution 
{
    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int i)
    {
        if(head==null)
            return head;
        if(i==0)
            return head.next;
        head.next=deleteNodeRec(head.next,i-1);
        return head;
        
        
        
    }
}
