public class solution {

    // Return a string array that contains all possible codes
    public static  String[] getCode(String input){
        // Write your code here
        if(input.length()==0){
            String ans[]={""};
            return ans;
        }
  String smallans[]=getCode(input.substring(1));
       
        int an=input.charAt(0)-'0';
        char firstchar=(char)('a'+an-1);
      
         for(int i=0;i<smallans.length;i++){
            smallans[i] = firstchar+smallans[i];
        }
     
        String smallans1[]=new String[0];
        if(input.length()>=2)
           {
               int ch1=input.charAt(0)-'0';
               int ch2=input.charAt(1)-'0';
               int an3=(ch1*10)+ch2;
               
               if(an3>=10 && an3<=26)
               {char firsttwochar=(char)('a'+an3-1);
                   smallans1=getCode(input.substring(2));
         for(int i=0;i<smallans1.length;i++){
             smallans1[i]=firsttwochar+smallans1[i];}
         }
        }
               String output[]=new String[smallans.length+smallans1.length];
               int k=0;
               for(int i=0;i<smallans.length;i++){
                   output[k]=smallans[i];
                   k++;
               }
               for(int i=0;i<smallans1.length;i++){
                   output[k]=smallans1[i];
                   k++;
               }
               return output;
           }

           }



