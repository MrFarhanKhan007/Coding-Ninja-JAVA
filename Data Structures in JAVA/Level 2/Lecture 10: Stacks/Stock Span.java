import java.util.Stack;
public class Solution {
	
    public static int[] stockSpan(int[] price) {
        // Write your code here
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<Integer>();
        span[0] = 1;
        stack.push(0);

        for(int i=1;i<price.length;i++){



            while( !stack.isEmpty() && price[i] > price[ stack.peek()] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
               
            }
            else{
                span[i] = i - stack.peek();
                
                
            }
            stack.push(i);



        }
        return span;



    }

}
