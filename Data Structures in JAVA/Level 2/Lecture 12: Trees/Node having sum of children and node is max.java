/* Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1 */

public class Solution {
	
	public static int sum(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum= root.data;
		for(int i=0;i<root.children.size();i++) {
			sum+=root.children.get(i).data;
		}
		return sum;
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if(root==null) {
			return null;
		}
		int sumRoot = sum(root);
		int max=Integer.MIN_VALUE;
		TreeNode<Integer> maxNode = null;
		for(int i=0;i<root.children.size();i++) {
			
			TreeNode<Integer> maxNode1 =maxSumNode(root.children.get(i));
			int sum = sum(maxNode1);
			if( max < sum ) {
				max = sum;
				maxNode = maxNode1;
			}
		}
		if( sumRoot > max ) {
			return root;
		}
		return maxNode;
		
	}

}
