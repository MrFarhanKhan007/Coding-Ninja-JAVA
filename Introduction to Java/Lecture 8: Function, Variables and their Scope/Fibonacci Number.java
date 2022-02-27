public class Solution {
    public static boolean checkMember(int n) {
        int a=1,b=1,c=0,f=0,i;
        for(i=0;c<2*n;i++)
        {
            c=a+b;
            if(n==c)
                f=1;
            a=b;
            b=c;
        }
        if(f==1)
        
        return true;
    
    else
        
        return false;
    }
}
