public class solution {

	public static int sum(int arr[])
	{
         int sum=0;

       for(int num : arr){

           sum+=num;

       }

       int res = sum-9*((sum-1)/9);

       return res; 
	}
}
