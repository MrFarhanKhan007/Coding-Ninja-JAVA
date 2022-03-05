import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Solution {
	
	public static void reverseQueue(Queue<Integer> queue) {
		
		if(queue.isEmpty()) {
			return ;
		}
		int temp = queue.poll();
		reverseQueue(queue);
		queue.add(temp);

	}
	public static Queue<Integer> reverseKelements(Queue<Integer> queue , int k) {
		
		Stack<Integer> stack = new Stack<>();
		for(int i=1;i<=k;i++) {
			stack.push(queue.poll());
		}
		for(int i=1;i<=k;i++) {
			queue.add( stack.pop()  );
		}
		for(int i=1;i<= queue.size() - k ;i++){
            queue.add(queue.poll());
        }
		return queue;

		
		
		
	}

}
