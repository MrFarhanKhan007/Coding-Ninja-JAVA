// Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
// Find and print the shortest distance from the source vertex (i.e. Vertex 0) to all other vertices (including source vertex also) using Dijkstra's Algorithm.
// Input Format :
// Line 1: Two Integers V and E (separated by space)
// Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
// Output Format :
// For each vertex, print its vertex number and its distance from source, in a separate line. The vertex number and its distance needs to be separated by a single space.
// Note : Order of vertices in output doesn't matter.
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
// 0 0
// 1 3
// 2 4
// 3 5

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int e = scanner.nextInt();
		int[][] edges = new int[n][n];
		for(int i=0;i<e;i++) {
			int sv = scanner.nextInt();
			int ev = scanner.nextInt();
			int weight = scanner.nextInt();
			edges[sv][ev] = weight;
			edges[ev][sv] = weight;
			
		}
		dijkstra(edges);
		
	}
	// shortest weight path 
	public static void dijkstra(int[][] edges) {
		
		int[] distance = new int[edges.length];
		boolean[] visited = new boolean[edges.length];
		
		distance[0] = 0;
		for(int i=1;i<distance.length;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i=1;i<edges.length;i++) {
			
			int minVertex = findMinDistanceUnvisitedVertex( distance,visited);
			visited[minVertex] = true;
			for(int j=0;j<edges.length;j++) {
				
				if(!visited[j] && edges[minVertex][j]!=0) {
					int d = edges[minVertex][j] + distance[minVertex];
					if( distance[j] > d  ) {
						distance[j] = d;
					}
				}
				
			}
			
		}
		
		for(int i=0;i<distance.length;i++) {
			System.out.println( i+" " + distance[i] );
		}
		
		
		
	}
	private static int findMinDistanceUnvisitedVertex(int[] distance ,boolean[] visited) {
		
		int minIndex = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<distance.length;i++) {
			
			if(!visited[i] &&  min > distance[i]  ) {
				min = distance[i];
				minIndex = i;
			}
			
		}
		return minIndex;
		
	}
	
	
}
