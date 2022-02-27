/* 4 4 4 4 
 * 3 3 3 
 * 2 2 
 * 1
 */

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print(n-i+1);
				j++;
			}
			
			System.out.println();;
			i++;
		}
		
	}
}
