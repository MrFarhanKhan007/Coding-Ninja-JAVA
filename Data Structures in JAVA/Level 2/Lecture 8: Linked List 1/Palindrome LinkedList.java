// Palindrome LinkedList
// Send Feedback
// Check if a given linked list is palindrome or not. Return true or false.
// Indexing starts from 0.
// Input format : Linked list elements (separated by space and terminated by -1)

// Sample Input 1 :
// 9 2 3 3 2 9 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 0 2 3 2 5 -1
// Sample Output 2 :
// false
import java.util.*;
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
     public static int LengthIterative(LinkedListNode<Integer> head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
    
    
	public static boolean isPalindrome(LinkedListNode<Integer> root) {
        
         int length=LengthIterative(root);
        ArrayList<Integer> list1=new ArrayList<Integer>(length);
        for(int i=0;i<length;i++)
        {
            list1.add(root.data);
            root=root.next;
        }
        
        int tail=length-1;
         int i=0;
        boolean isPalindrome=true;
        while(i<=tail)
        {
            if(list1.get(i)!=list1.get(tail))
            {
                isPalindrome=false;
            	return false;
            }
            i++;
            tail--;
        }
        
        return isPalindrome;
    }
}
