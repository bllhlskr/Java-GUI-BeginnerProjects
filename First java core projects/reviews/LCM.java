
public class LCM 
{
	public static void main(String[] args) 
	{
		int n1 = 18; 
		int n2 = 36;
		
		/*
		 * multiply the 2 numbers
		 * divide the answer with gcd
		 */
		int a = n1 * n2;
		
		int smallest;
		if(n1 < n2)
			smallest = n1;
		else
			smallest = n2;
		
		for( ; smallest > 0; smallest--)
		{
			if(n1 % smallest == 0 && n2 % smallest == 0)
			{
				System.out.println("gcd is "+ smallest);
				break;
			}
		}
		
		System.out.println("LCM is " + ( a / smallest));
	}
}
