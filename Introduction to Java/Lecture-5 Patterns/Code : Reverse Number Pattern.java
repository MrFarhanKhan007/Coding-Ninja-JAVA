import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i-j+1);
			}
			System.out.println();
		}

	}

}