import java.util.Scanner;
public class Solution {
    

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=2;i<=n;i++){
            boolean prime=true;
            int d=2;  
        	while(d<=i-1){
            	if(i%d==0){
                    prime=false;
            		break;
            	}
           	 	d=d+1;
            }
            if(prime){
                System.out.println(i);
            }
        }
	}
}
