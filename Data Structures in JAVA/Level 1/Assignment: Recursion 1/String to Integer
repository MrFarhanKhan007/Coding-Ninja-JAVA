public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        if (input.length()==0)
        {
            return 0;
        }
        int smallOutput=convertStringToInt(input.substring(0,input.length()-1));
        int val=(int)input.charAt(input.length()-1);
        val=(val-48);
        //System.out.println(val);
        return (val)+(smallOutput*10);

	}
}
