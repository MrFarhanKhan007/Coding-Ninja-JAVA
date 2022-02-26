public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        
        
        
        boolean ans;
        
        
         if(input[0]==x)
            return true;
            
         if(input[0]!=x && input.length==1)
        return false;
        
        int arr[]=new int[input.length-1];
        
        for(int i=1;i<input.length;i++)
            arr[i-1]=input[i];
        
        ans=checkNumber(arr,x);
        
        
        return ans;
		
	}
}
