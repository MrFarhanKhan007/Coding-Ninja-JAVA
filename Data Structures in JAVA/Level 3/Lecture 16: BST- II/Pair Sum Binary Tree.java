/*Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
Note:
1. Assume the given binary tree contains all unique elements.
2. In a pair, print the smaller element first. Order of different pairs doesn't matter.
Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of S.
Output Format :
Print each pair in a new line, as described in the task. 
Constraints:
Time Limit: 1 second
Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
15
Sample Output 1:
5 10
6 9*/

import java.util.*;
import java.util.Collections;
public class Solution {
    static ArrayList<Integer> help(BinaryTreeNode<Integer> root,ArrayList<Integer> arr){
        if(root==null)
            return null;
        help(root.left,arr);
        arr.add(root.data);
        help(root.right,arr);
        return arr;
    } 

    static int binarySearch(ArrayList<Integer> arr, int x,int left,int right) 
    { 
       while (left <= right)
        { 
            int mid = left + (right - left) / 2; 
    
            // Check if x is present at mid 
            if (arr.get(mid) == x) 
                return mid; 
    
            // If x greater, ignore left half 
            if (arr.get(mid) < x) 
                left = mid + 1; 
    
            // If x is smaller, ignore right half 
            else
                right = mid - 1; 
        } 
    
        // if we reach here, then element was 
        // not present 
        return -1; 
    }
	static void pairSum(BinaryTreeNode<Integer> root, int sum) {
        ArrayList<Integer> a=new ArrayList<>();
       	a=help(root,a);
     	Collections.sort(a);
        for(int i=0;i<a.size();i++){
            int rem=sum-a.get(i);
            int ind=binarySearch(a,rem,i+1,a.size()-1);
        	if(ind!=-1){
                System.out.println(a.get(i)+" "+a.get(ind));
            }
        }
        
	}

}
