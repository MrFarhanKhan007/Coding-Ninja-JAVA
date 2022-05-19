// You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
// Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
// Input Format
// Line 1: Integer N
// Next N Lines: Each line will contain ith row elements (separated by space)
// Output Format :
// The output line contains true if any path exists for the rat to reach its destination otherwise print false.
// Sample Input 1 :
// 3
// 1 0 1
// 1 0 1
// 1 1 1
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 1 0 1
// 1 0 1
// 0 1 1
// Sample Output 2 :
//  false


public class Solution {
    
	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
		int path[][] = new int[maze.length][maze.length];
		return solveMaze(maze,0,0,path);
	}
    
    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path)
	{
		//Check if i,j are valid pair of indices => i,j>=0
		int n=maze.length;
		if (i<0 || j<0 || i>=n || j>=n)
			return false;
		
		//If cell is already part of the path
		if (path[i][j]==1)
			return false;
		
		//If cell is blocked in maze (cell value=0)
		if (maze[i][j]==0)
			return false;
		
		//If all previous conditions fail, then the cell is a possible path
		//Include the cell in current path
		path[i][j]=1;
		
		//If we have reached ending point 
		if (i==n-1 && j==n-1)
			return true;
		
		//Now, explore in all directions
		// Direction 1 - move towards cell above (top direction)
		if (solveMaze(maze,i-1,j,path))
			return true;
		
		//Direction 2 - move towards cell to the right (right direction)
		if (solveMaze(maze,i,j+1,path))
			return true;
		
		//Direction 3 - move towards cell below (bottom direction)
		if (solveMaze(maze,i+1,j,path))
			return true;
		
		//Direction 3 - move towards cell to the left (left direction)
		if (solveMaze(maze,i,j-1,path))
			return true;
		
		//If none of the conditions are satisfied, then the path is not working out
		return false;
	}
}
