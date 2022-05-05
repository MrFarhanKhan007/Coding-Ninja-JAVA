/*Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Write a simple recursive solution.
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
Constraints :
1 <= h <= 24
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315*/

/*
    Time complexity: O(2^N)
    Space complexity: O(N)

    where N is the final height of the binary tree
*/

public class Solution {

	public static long balancedBTs(long height){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        int h=(int)height;
        int storage[]=new int[h+1];
        for(int i=0;i<storage.length;i++)
        {
            storage[i]=-1;
        }
        int mod=(int)Math.pow(10,9)+7;
        return balancedOfTreesHeightH(storage,h,mod);
    }
    private static int balancedOfTreesHeightH(int storage[],int height,int mod){
        if(height==0 || height==1)
        {
            storage[height]=1;
            return 1;
        }
        if(storage[height]!=-1)
            return storage[height];
        int x=balancedOfTreesHeightH(storage,height-1,mod);
        int y=balancedOfTreesHeightH(storage,height-2,mod);
        long value1=(long)x*x;
        long value2=(long)y*x*2;
        int res1=(int)(value1%mod);
        int res2=(int)(value2%mod);
        storage[height]=(res1+res2)%mod;
        return storage[height];


	}
}
