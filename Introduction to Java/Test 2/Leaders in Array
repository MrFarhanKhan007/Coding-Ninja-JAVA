public class Solution {

	public static void leaders(int[] input) {
		
	 int len = input.length;
       
        
        for(int i=0; i<len; i++){
            boolean smaller = true;
            for(int j = i+1;j<len;j++){
            if(input[i] < input[j]){
                smaller = false;
                //System.out.print(input[i]);
                break;
            }
                }
            
            
            if (smaller){
                System.out.print(input[i] + " ");
            }
        }
		
	}

}
