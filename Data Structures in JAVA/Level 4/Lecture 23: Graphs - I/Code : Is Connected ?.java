// Given an undirected graph G(V,E), check if the graph G is connected graph or not.
// Note:
// 1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
// 2. E is the number of edges present in graph G.
// Input Format :
// The first line of input contains two integers, that denote the value of V and E.
// Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
// Output Format :
// The first and only line of output contains "true" if the given graph is connected or "false", otherwise.
// Constraints :
// 0 <= V <= 1000
// 0 <= E <= (V * (V - 1)) / 2
// 0 <= a <= V - 1
// 0 <= b <= V - 1
// Time Limit: 1 second
// Sample Input 1:
// 4 4
// 0 1
// 0 3
// 1 2
// 2 3
// Sample Output 1:
// true
// Sample Input 2:
// 4 3
// 0 1
// 1 3 
// 0 3
// Sample Output 2:
// false 
// Sample Output 2 Explanation
// The graph is not connected, even though vertices 0,1 and 3 are connected to each other but there isn’t any path from vertices 0,1,3 to vertex 2. 


import java.util.Scanner;

public class Solution {

    public static boolean isConnected(int[][] edges){
        
        int n=edges.length;
        boolean [] visited=new boolean[n];
        
        helper(edges,0,visited);
        
        for(boolean b:visited){
            if(b!=true)
                return false;
        }
        return true;
    }
    
    public static void helper(int [][] edges,int v,boolean []visited){
    if(visited.length==0)
        return;
        visited[v]=true;
        for(int i=0;i<edges.length;i++){
            if(edges[v][i]==1&&!visited[i])
                helper(edges,i,visited);
        }
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		int edges[][] =new int[V][V];
        
        for(int i=0;i<E;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            
            edges[sv][fv]=1;
            edges[fv][sv]=1;
        }
        
        System.out.println(isConnected(edges));
	}
}
