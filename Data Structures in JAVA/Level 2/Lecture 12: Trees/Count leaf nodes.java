/* Given a generic tree, count and return the number of leaf nodes present in the given tree.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Count of leaf nodes
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
4 */

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;
		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	public static int count = 0;
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
if (root.children.size() == 0) {
			count++;
		}
		for (int i = 0; i < root.children.size(); i++) {
			countLeafNodes(root.children.get(i));
		}
		return count;
}
	}
	
