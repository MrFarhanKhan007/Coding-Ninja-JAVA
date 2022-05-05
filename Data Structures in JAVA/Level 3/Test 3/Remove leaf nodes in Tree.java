/*Remove all leaf nodes from a given generic Tree. Leaf nodes are those nodes, which don't have any children.
Note : Root will also be a leaf node if it doesn't have any child. You don't need to print the tree, just remove all leaf nodes and return the updated root.
Input format :
Line 1 : Elements in level order form separated by space (as per done in class). Order is - `

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element `
Output Format :
Elements are printed level wise, each level in new line (separated by space)
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 : (Level wise, each level in new line)
10
20*/

public class Solution {

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if(root == null)
			return null;
		// when there are no children of the given root
		if(root.children.size()==0)
			return null;
		for(int i = 0;i<root.children.size();i++)
		{
			TreeNode<Integer> temp = removeLeafNodes(root.children.get(i));
			if(temp == null)
			{
				root.children.remove(i);
				i--;
			}
		}
		return root;
		
	}
}
