
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int i=1;
        while(i<=n) {
        	int j=1;
        	int t= 'A'+i-1;
        	while(j<=i) {
        		System.out.print((char)(t));
        		t++;
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}

}
