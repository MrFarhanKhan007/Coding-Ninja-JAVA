/*For a given Binary Tree of type integer, update it with its corresponding mirror image.
Example:
Alt text

Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints the mirrored tree in a level-wise order. 
Each level will be printed on a new line. Elements printed at each level will be separated by a single line.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1 
3 2 
7 6 5 4
Sample Input 2:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 2:
5 
6 10 
3 2 
9*/

// ublic class Solution {

// /*	Binary Tree Node class
//  * 
//  * class BinaryTreeNode<T> {
// 		T data;
// 		BinaryTreeNode<T> left;
// 		BinaryTreeNode<T> right;
		
// 		public BinaryTreeNode(T data) {
// 			this.data = data;
// 		}
// 	}
// 	*/
//     public static void printLevelWise(BinaryTreeNode<Integer> root) {
//     QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
// 		pendingNodes.enqueue(root);
		
// 		while (!pendingNodes.isEmpty()) {
// 			BinaryTreeNode<Integer> frontNode = null;
// 			try {
// 				frontNode = pendingNodes.dequeue();
// 			} catch (QueueEmptyException e) {
// 				e.printStackTrace();
// 			}
// 			System.out.print(frontNode.data + ":");
// 			if (frontNode.left != null) {
// 				pendingNodes.enqueue(frontNode.left);
// 				System.out.print("L:" + frontNode.left.data + ",");
// 			} else {
// 				System.out.print("L:" + "-1" + ",");
// 			}
// 			if (frontNode.right != null) {
// 				pendingNodes.enqueue(frontNode.right);
// 				System.out.print("R:" + frontNode.right.data);
// 				System.out.println();
// 			} else {
// 				System.out.print("R:" + "-1");
// 				System.out.println();
// 			}
// 		}
// 	}

	
// 	public static void mirror(BinaryTreeNode<Integer> root){
// 		/* Your class should be named Solution
// 		 * Don't write main().
// 		 * Don't read input, it is passed as function argument.
// 		 * No need to print or return the output.
// 		 * Taking input and printing output is handled automatically.
// 		 */
// if (root == null || root.left == null && root.right == null) {
// 			return;
// 		} 
// 		BinaryTreeNode<Integer> temp = root.left;
// 		root.left = root.right;
// 		root.right = temp;
// 		mirror(root.left);
// mirror(root.right);
// 	}
	
// }
/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {
    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return null;
       
        BinaryTreeNode<Integer> right=helper(root.right);
        BinaryTreeNode<Integer> left=helper(root.left);
        root.left=right;
        root.right=left;
        return root;
    }

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
       root=helper(root);
        
        
	}
	
}
