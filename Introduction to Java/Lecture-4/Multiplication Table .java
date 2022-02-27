import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		int n= scanner.nextInt();
		int i=1;
		
		while(i<=10) {
			int Product= n*i;
			System.out.println(Product);
			i=i+1;
			
		}

	}

}
