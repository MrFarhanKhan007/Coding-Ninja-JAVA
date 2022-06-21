/* Total Strings
You are given a positive integer 'N'. Your task is to find the number of strings of length ‘N’ that can be formed using only the characters ‘a’, ‘b’ and ‘c’. The strings formed should be such that the number of ‘b’ and ‘c’ in the string is at most 1 and 2, respectively.
Example:
Let’s say N = 2. The strings of length 2, which satisfy the given constraints are: “aa”, “ab”, “ac”, “ba”, “bc”, “ca”, “cb”, “cc”. Hence, the output is 8.
Input Format:
The first line of input contains an integer ‘T’ representing the number of test cases.

The first and the only line of every test case contains a positive integer ‘N’ representing the length of strings to be found.
Output Format:
For each test case, the number of strings of length ‘N’ which satisfy the given constraints is printed.

Print the output of each test case in a separate line.
Note:
Since the number of possible strings can be very large, print the answer modulo 1000000007.

You do not need to print anything, it has already been taken care of. Just implement the given function.
Follow Up:
Can you solve the problem in constant time and using constant extra space i.e. O(1) time and space complexity?
Constraints:
1 <= T <= 100 
1 <= N <= 3000

Where 'T' denotes the number of test cases, 'N' denotes the length of strings. 

Time Limit: 1 sec
Sample Input 1:
2
2
3
Sample Output 1:
8
19
Explanation 1:
For the first test case, refer to the example explained before.

For the second test case, N = 3. The strings of length 3, which satisfy the given constraints are: “aaa”, “aab”, “aac”, “aba”, “abc”, “aca”, “acb”, “acc”, and so on. There are a total of 19 possible strings. 
Sample Input 2:
2
4
1
Sample Output 2:
39
3

	Time complexity: O(1)
	Space Complexity: O(1)

*/

public class Solution
{
    public static int countStrings(int n)
    {
        long m = n;
        long temp = ((m % 1000000007)  * ((m * m) % 1000000007 - 1) / 2) % 1000000007;
        
        // Find the solution
        long ans = ((1 + 2 * m) % 1000000007 + temp) % 1000000007;
		
        // Return the variable ans
        return (int)ans;
    }
}
