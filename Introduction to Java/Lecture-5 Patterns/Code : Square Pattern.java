
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
	  Scanner scanner= new Scanner(System.in);
	  int n= scanner.nextInt();
	  scanner.close();
	  int i=1;
	  while (i<=n) {
		  int j=1;
		  while(j<=n) {
			  System.out.print(n);
			  j++;
		  }
		  System.out.println();
		  i++;
	  }

	}

}
