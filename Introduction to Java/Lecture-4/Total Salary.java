import java.util.*;
public class Main{
    
       public static void main(String [] args){
         Scanner s=new Scanner(System.in);
           double basic=s.nextDouble();
           char grade=s.next().charAt(0);
           Character.toUpperCase(grade);
           double hra =basic*20/100;   
           double da=basic*50/100;
           int allow=0;
           if(grade=='A')
                allow=1700;
           else if(grade=='B')
                allow=1500;
           else if(grade>='C' && grade<='Z')
                allow=1300;
           double pf=basic*11/100;
           double Salary= (double)basic+hra+da+allow-pf;
           double totalSalary=Salary-(int)Salary;
           if(totalSalary<0.5)
               System.out.println((int)Salary);
           else 
               System.out.println((int)Salary+1);
       }
}
