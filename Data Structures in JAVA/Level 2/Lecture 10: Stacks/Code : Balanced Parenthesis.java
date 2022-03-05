import java.util.Stack;

public class Solution {
	
	public static char pair(char c) {
		if(c=='}') {
			return '{';
		}
		if(c==')') {
			return '(';
		}
		if(c==']') {
			return '[';
		}
		return '\0';
	}
	
	public static boolean isBalanced(String expression) {
		// Write your code here
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++) {
			char c = expression.charAt(i);
			if( c=='{' || c=='(' || c=='[' ) {
				stack.push(c);
			}
			else if( c=='}' || c==')' || c==']' ) {
				
				if(stack.isEmpty()) {
					return false;
				}
				
				if(  pair(c) ==stack.peek() ) {
					stack.pop();
				}
				else {
					return false;
				}
				
			}
			
			
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;

	
	}

}
