import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;

        while(i<=n) {
            int j=n;
            int odd= 2*i-1;
            while(j>=i){
                System.out.print(odd);
                odd=odd+2;
                j--;
            }
            
            int p=1;
            int k =1;
            while (k<=i-1) {
                System.out.print(p);
                p=p+2;  
                k++;
            }
            
            System.out.println();
            i++;
        }
    }
}
