public class solution {
	public static void printSubsetsSumTok(int input[], int k) {
	   int output[]=new int[0];
        helper(input,0,k,output);
		
	}
    public static void helper(int input[],int si,int k,int output[]){
        if(si==input.length){
            if(k==0)
            {
                for(int i=0;i<output.length;i++){
                    System.out.print(output[i]+" ");
                }
                System.out.println();
                return;
            }
            else
                return;
        }
        helper(input,si+1,k,output);
        int newoutput[]=new int[output.length+1];
        int i=0;
        for( ;i<output.length;i++)
        {
            newoutput[i]=output[i];
        }
            newoutput[i]=input[si];
        helper(input,si+1,k-input[si],newoutput);
  
    }
}


