/*You are given a stream of 'N' integers. For every 'i-th' integer added to the running list of integers, print the resulting median.
Print only the integer part of the median.
Input Format :
The first line of input contains an integer 'N', denoting the number of integers in the stream.

The second line of input contains 'N' integers separated by a single space.
Output Format :
Print the running median for every integer added to the running list in one line (space-separated).
Input Constraints
0 <= N <= 10 ^ 5
1 <= ARR[i] <= 10 ^ 5

Time Limit: 1 sec
Sample Input 1 :
6
6 2 1 3 7 5
Sample Output 1 :
6 4 2 2 3 4
Explanation of Sample Output 1 :
S = {6}, median = 6
S = {6, 2} -> {2, 6}, median = 4
S = {6, 2, 1} -> {1, 2, 6}, median = 2
S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4
Sample Input 2 :
5
5 4 3 2 1
Sample Output 2 :
5 4 4 3 3*/
import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

	public static void findMedian(int arr[])  {
        
       int n = arr.length;

		PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(new Comparator<Integer>() 
                                                               {
			@Override
			public int compare(Integer first, Integer second) 
            {
				return (second - first);
			}
		});
		
		PriorityQueue<Integer> higherHalf = new PriorityQueue<>();

		int median;

		// The variable size is the size of the current stream
		for(int size = 1; size <= n; size++) 
        {
			if(!lowerHalf.isEmpty() && lowerHalf.peek() > arr[size-1]) 
            {	
                // Insert ARR[size-1] in lowerHalf
				lowerHalf.add(arr[size - 1]);

				if(lowerHalf.size() > higherHalf.size() + 1) 
                {	
                    // Insert the top element of lowerHalf into higherHalf
					higherHalf.add(lowerHalf.poll());	      
				}
			} 
            else 
            {
				higherHalf.add(arr[size - 1]);

				if(higherHalf.size() > lowerHalf.size() + 1) 
                {	
                    // Insert the top element of higherHalf into lowerHalf
					lowerHalf.add(higherHalf.poll());
				}
			}
			
            // Check if size is odd
			if(size % 2 == 1) 
            {
				if(higherHalf.size() > lowerHalf.size()) 
                {
					median = higherHalf.peek();
				} 
                else 
                {
					median = lowerHalf.peek();
				}
			} 
            else 
            {
				median = (lowerHalf.peek() + higherHalf.peek()) / 2;
			}
			
            // Print the variable median
			System.out.print(median + " ");
		}
	}

}
