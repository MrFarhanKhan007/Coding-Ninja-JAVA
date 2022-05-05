/* Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
Return NULL if no node is present with value greater than n.
Input format :

Line 1 : Integer n

Line 2 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with value just greater than n.

Sample Input 1 :
18
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
20
Sample Input 2 :
21
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
30*/
public class Solution {
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		if(root==null) {
			return root;
		}
		int min=Integer.MAX_VALUE;
		TreeNode<Integer> minNode = null;
		for(int i=0;i<root.children.size();i++) {
			
			TreeNode<Integer> maxNode = findNextLargerNode(root.children.get(i), n);
			if(maxNode==null) {
				continue;
			}
			int max = maxNode.data;
			if(min>max) {
				min = max;
				minNode = maxNode;
			}
		}
		if( root.data > n && root.data < min ) {
			return root;
		}
		return minNode;
		
	}

}
