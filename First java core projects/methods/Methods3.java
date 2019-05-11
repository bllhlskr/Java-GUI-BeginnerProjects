import java.util.Scanner;


public class Methods3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number: ");
		int n = sc.nextInt();
		
		System.out.println(CheckPrime(n) ? n + " is prime": n + " is not prime");
		System.out.println(CheckPerfect(n) ? n + " is perfect": n + " is not perfect");
	}
	
	public static boolean CheckPrime(int n)
	{
		for (int i = 2; i < n; i++) 
		{
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static boolean CheckPerfect(int n)
	{
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			if(n % i == 0)
				sum += i;
		}
		return sum == n ? true : false; //in-line if
		/*if(sum == n)
			return true;
		else 
			return false;
		*/
	}
}
