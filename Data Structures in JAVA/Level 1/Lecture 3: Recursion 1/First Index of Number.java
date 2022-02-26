public class Solution {
    
    
    
    public static int Index1(int input[],int x,int index)
    {
        if(input[index]==x)
        return index;
        
      if(input[index]!=x && index==input.length-1)
        return -1;
        
        index=Index1(input,x,index+1);
        
        return index;
        
        
    }

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		  
       int index=Index1(input,x,0);
           return index;
	}
	
}
