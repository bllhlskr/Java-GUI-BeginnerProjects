import java.util.Random;


public class Arrays3 
{
	public static void main(String[] args) 
	{
		int[] a = {4,5,6,7};

		PrintArray(a);
		
		int n = Generate();
		
		if(Check(a, n) == false)
			a[2] = n;
		
		PrintArray(a);
		
	}
	
	public static boolean Check(int[] arr, int n)
	{
		/*
		 * returns true if the array contains the number.
		 * returns false otherwise
		 */
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == n)
				return true;
		
		return false;
	}
	
	public static int Generate()
	{
		Random r = new Random();
		return r.nextInt(10); //[0, 10)
	}
	
	public static void PrintArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
