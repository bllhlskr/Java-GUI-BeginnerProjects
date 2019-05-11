
public class GCD 
{
	public static void main(String[] args) 
	{
		int n1 = 1500;
		int n2 = 1000000;
		
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
		if(smallest == 1)
			System.out.println("nothing in common");
		
	}
}
