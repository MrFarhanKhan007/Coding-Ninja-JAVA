public class solution {
	public static void print2DArray(int input[][]) {
		int row=input.length;
        int col=input[0].length;
        
        for(int i=0;i<row;i++){
            
           int count=row-i;
            
           while(count>0)   {
                
               for(int j=0;j<col;j++){
                   
                 System.out.print(input[i][j]+" ");
                   
               }  
                System.out.println();
                count--;
            }  
            
        }
    }
}
