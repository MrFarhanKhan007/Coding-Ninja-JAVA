public class Solution {
	public static boolean isPermutation(String str1, String str2) {
		int n1 = str1.length();
        int n2 = str2.length();
        int[] freq = new int[256];
       	int c,i;
        boolean b =true;
        for(i=0;i<n1;i++)
        {
            c = str1.charAt(i);
            freq[c]++;
        }
        for(i=0;i<n2;i++)
        {
            c = str2.charAt(i);
            freq[c]--;
        }
        for(i=0;i<256;i++)
        {
            if(freq[i]!=0)
            {
                b = false;
                break;
            }
        }
        return b;
	}
}
