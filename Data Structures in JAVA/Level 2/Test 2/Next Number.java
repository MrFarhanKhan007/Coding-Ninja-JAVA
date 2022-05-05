/* Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 */
public class Solution {
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp;
        LinkedListNode<Integer> prev =null;
        LinkedListNode<Integer> curr=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        LinkedListNode<Integer> tem=prev;
        int extra=0;
        LinkedListNode<Integer> a= new LinkedListNode<Integer>(1);        
        while(tem!=null){
            if(tem.data==9){
                tem.data=0;
                extra=1;
                if(tem.next==null){
                    tem.next=a;
                }
            }else{
              if(extra==1){                
                int d=tem.data+1;
                if(d==10){
                  tem.data=0;
                   extra=1;  
                }else{
                   extra=0;
                }
              }else{                
                  tem.data=tem.data+1;
                  break;
            }}
            tem=tem.next;
        }
        LinkedListNode<Integer> temp1;
        LinkedListNode<Integer> prev1 =null;
        LinkedListNode<Integer> curr1=prev;
        while(curr1!=null){
            temp1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=temp1;
        }
        return prev1;
    }

