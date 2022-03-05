import java.util.Stack;

public class Solution {

	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<input.length();i++) {

			if(input.charAt(i)==')') {
				int count =0;
				while(stack.peek()!='(' ) {
					count++;
					stack.pop();
				}
				stack.pop();
				if(count==0||count==1)
					return true;

			}
			else {
				stack.push(input.charAt(i));
			}

		}
		return false;
	}

}
