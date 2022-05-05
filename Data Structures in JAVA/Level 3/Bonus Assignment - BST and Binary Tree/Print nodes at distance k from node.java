/*You are given a Binary Tree of type integer, a target node, and an integer value K.
Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.
Example:
For a given input tree(refer to the image below):
1. Target Node: 5
2. K = 2
alt txt

Starting from the target node 5, the nodes at distance K are 7 4 and 1.
Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

The second line of input contains two integers separated by a single space, representing the value of the target node and K, respectively.
Output Format:
All the node data at distance K from the target node will be printed on a new line.

The order in which the data is printed doesn't matter.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
3 1
Sample Output 1:
9
6
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
3 3
Sample Output 2:
4
5*/
public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	public static void printNodes(BinaryTreeNode<Integer> node, int k){
        if(node == null)
            return;
        if(k==0){
            System.out.println(node.data+" ");
            return;
        } else {
            printNodes(node.left, k-1);
            printNodes(node.right, k-1);
            
        }
    }
	public static int AtDistanceK(BinaryTreeNode<Integer> root, int data, int k) {
        if(root==null){
            return -1;
        }
        if(root.data.equals(data)){
            printNodes(root,k);
            return k-1;
        }
        int left = AtDistanceK(root.left,data,k);
        int right = AtDistanceK(root.right,data,k);
        if(left != -1){
            if(left == 0){
                System.out.println(root.data);
                return -1;
            } else {
                printNodes(root.right,left -1);
                return left-1;
            }
            } else if(right != -1){
                if(right ==0){
                    System.out.println(root.data);
                    return -1;
                } else {
                    printNodes(root.left,right-1);
                    return right-1;
                }
            }
            return -1;
        
    }
    
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		// Write your code here
		int a = AtDistanceK(root,node,k);
	}
}
