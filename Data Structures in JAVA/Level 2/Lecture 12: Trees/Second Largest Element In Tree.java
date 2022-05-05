/* Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output format:
Second Largest node data
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
40 */

public class Solution {

	public static void change(TreeNode<Integer> root,int m) {

		if(root==null) {
			return ;
		}
		if(root.data == m) {
			root.data = Integer.MIN_VALUE;
		}
		for(int i=0;i<root.children.size();i++) {
			change(root.children.get(i), m);
		}

	}

	public static TreeNode<Integer> largest(TreeNode<Integer> rootNode ) {
		if(rootNode==null) {
			return rootNode;
		}
		int max =rootNode.data;
		TreeNode<Integer> maxNode = rootNode;
		for(int i=0;i<rootNode.children.size();i++) {
			TreeNode<Integer> large = largest(rootNode.children.get(i));
			if(large == null){
				continue;
			}
			if(max <large.data) {
				max = large.data;
				maxNode = large;
			}
		}
		return maxNode;
	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> rootNode) {
		if(rootNode==null) {
			return null;
		}
		int largest = largest(rootNode).data;

		change(rootNode, largest);

		return largest(rootNode);
	}

}
