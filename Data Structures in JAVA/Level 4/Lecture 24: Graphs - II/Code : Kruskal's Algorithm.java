// Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
// Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
// For printing MST follow the steps -
// 1. In one line, print an edge which is part of MST in the format - 
// v1 v2 w
// where, v1 and v2 are the vertices of the edge which is included in MST and whose weight is w. And v1  <= v2 i.e. print the smaller vertex first while printing an edge.
// 2. Print V-1 edges in above format in different lines.
// Note : Order of different edges doesn't matter.
// Input Format :
// Line 1: Two Integers V and E (separated by space)
// Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
// Output Format :
// Print the MST, as described in the task.
// Constraints :
// 2 <= V, E <= 10^5
// Time Limit: 1 sec
// Sample Input 1 :
// 4 4
// 0 1 3
// 0 3 5
// 1 2 1
// 2 3 8
// Sample Output 1 :
// 1 2 1
// 0 1 3
// 0 3 5

import java.util.Scanner;
import java.util.Arrays;
 class Edge implements Comparable<Edge>{
    int source;
    int destination;
    int weight;
    public int compareTo(Edge o){
        return this.weight-o.weight;
        // if(this.weight>o.weight)
        //     return 1;
        // else if(this.weight<o.weight)
        //     return -1;
        // else
        //     return 0;
    }
}
public class Solution {
    public static void kruskals(Edge input[],int V){
        Arrays.sort(input);
        int count=0;
        int k=0;
        Edge output[]=new Edge[V-1];
        int parent[]=new int[V];
        for(int j=0;j<V;j++){
            parent[j]=j;
        }
        while(count!=V-1){
            Edge currentEdge=input[k];
            int sourceparent=parentcall(parent,currentEdge.source);
            int destinationparent=parentcall(parent,currentEdge.destination);
            if(sourceparent!=destinationparent)
            {
                output[count]=currentEdge;
                count++;
                parent[sourceparent]=destinationparent;
            }
            k++;
        }
        for(int i=0;i<V-1;i++){
            if(output[i].source<=output[i].destination)
                System.out.println(output[i].source+" "+output[i].destination+" "+output[i].weight);
            else
                System.out.println(output[i].destination+" "+output[i].source+" "+output[i].weight);
        }
    }
        public static int parentcall(int[] parent,int vertex){
            if(vertex==parent[vertex])
                return  vertex;
            return parentcall(parent,parent[vertex]);
        }








        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        Edge input[]=new Edge[E];
        for(int i=0;i<input.length;i++){
            input[i]= new Edge();
            input[i].source=s.nextInt();
            input[i].destination=s.nextInt();
            input[i].weight=s.nextInt();
        }
        kruskals(input,V);
    }}
