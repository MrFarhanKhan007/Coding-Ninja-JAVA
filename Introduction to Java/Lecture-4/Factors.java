import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		int number;
		number= scanner.nextInt();
		for (int i=2;i<number;i++) {
			if (number%i==0)
			System.out.print(i+" ");
		}
	}

}
