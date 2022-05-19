// An island is a small piece of land surrounded by water . A group of islands is said to be connected if we can reach from any given island to any other island in the same group . Given V islands (numbered from 1 to V) and E connections or edges between islands. Can you count the number of connected groups of islands.
// Input Format :
// The first line of input contains two integers, that denote the value of V and E.
// Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b. 
// Output Format :
// Print the count the number of connected groups of islands
// Constraints :
// 0 <= V <= 1000
// 0 <= E <= (V * (V-1)) / 2
// 0 <= a <= V - 1
// 0 <= b <= V - 1
// Time Limit: 1 second
// Sample Input 1:
// 5 8
// 0 1
// 0 4
// 1 2
// 2 0
// 2 4
// 3 0
// 3 2
// 4 3
// Sample Output 1:
// 1 

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Solution {

    
      public static void BFShelper(int edges[][],int sv,boolean visited[])
    {
        Queue<Integer> q =new LinkedList<Integer>();
        q.add(sv);
        visited[sv]=true;
        
        while(!q.isEmpty())
        {
            int front=q.poll();
           
            
            for(int i=0;i<edges.length;i++)
            {
                if(edges[front][i]==1 && !visited[i])
                {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    
	public static int numConnected(int[][] edges, int n) {                               // n is the number of edges
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
         boolean visited[]=new boolean[n];
         int count=0;
        for(int i=0;i<edges.length;i++)
        {
            if(visited[i]==false)
            {
                count++;
                BFShelper(edges,i,visited);
            }
                 
        }
        
        return count;
	}


}
