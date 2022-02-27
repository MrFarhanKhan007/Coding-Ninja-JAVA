
import java.util.Scanner;

class Solution
{
	static int fib(int n)
	{
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main (String args[])
	{
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n));
	}
} 
