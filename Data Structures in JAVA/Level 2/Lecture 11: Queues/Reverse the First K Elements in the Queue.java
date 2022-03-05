
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) 
    {
		//Your code goes here
        if (input.size()>k)
        {
            k=k%input.size();
        }
        if (k==0 || k==1)
        {
            return input;
        }
        
        reverseQueue(input,k);
        
        for (int i=0;i<input.size()-k;i++)
        {
            input.add(input.remove());
        }
        
        return input;
        
	}
    
    public static void reverseQueue(Queue<Integer> input, int k) 
    {
		//Your code goes here
        if (input.size()==0 || input.size()==1 || k==0)
        {
            return;
        }
        
        int temp=input.remove();
        reverseQueue(input,k-1);
        input.add(temp);
	}

}
