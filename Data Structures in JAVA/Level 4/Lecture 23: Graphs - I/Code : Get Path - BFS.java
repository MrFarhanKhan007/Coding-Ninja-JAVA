// Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
// Find the path using BFS and print the shortest path available.
// Note:
// 1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
// 2. E is the number of edges present in graph G.
// 3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
// 4. Save the input graph in Adjacency Matrix.
// Input Format :
// The first line of input contains two integers, that denote the value of V and E.
// Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
// The following line contain two integers, that denote the value of v1 and v2.
// Output Format :
// Print the path from v1 to v2 in reverse order.
// Constraints :
// 2 <= V <= 1000
// 1 <= E <= (V * (V - 1)) / 2
// 0 <= a <= V - 1
// 0 <= b <= V - 1
// 0 <= v1 <= 2^31 - 1
// 0 <= v2 <= 2^31 - 1
// Time Limit: 1 second
// Sample Input 1 :
// 4 4
// 0 1
// 0 3
// 1 2
// 2 3
// 1 3
// Sample Output 1 :
// 3 0 1
// Sample Input 2 :
// 6 3
// 5 3
// 0 1
// 3 4
// 0 3
// Sample Output 2 :

import java.util.Scanner;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int[V][V];
        for(int i=0;i<E;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        int V1=s.nextInt();
        int V2=s.nextInt();
        boolean visited[]=new boolean[V];
        ArrayList<Integer> ans=getPathBFS(edges,visited,V1,V2);
        if(ans!=null){
            for(int elem:ans)
            {
                System.out.print(elem+" ");
            }
        }
    }
    public static ArrayList<Integer> getPathBFS(int[][] edges,boolean[] visited,int V1,int V2){
        if(V1==V2)
        {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            ans.add(V1);
            visited[V1]=true;
            return ans;
        }
        Queue<Integer> q=new LinkedList<Integer>();
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(V1);
        visited[V1]=true;
        while(!q.isEmpty() ){
            int first=q.remove();
            for(int i=0;i<edges.length;i++){
                if(edges[first][i]==1 && !visited[i]){
                    visited[i]=true;
                    q.add(i);
                    h.put(i,first);
                    if(i==V2)
                    {    ans.add(i); 
                     while(!ans.contains(V1)){

                         int b=h.get(i);
                         ans.add(b);
                         i=b;
                     }
                     return ans;
                    }
                }
            }



        }


        return null;
    }


}
