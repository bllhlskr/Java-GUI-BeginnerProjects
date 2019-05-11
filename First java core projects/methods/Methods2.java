import java.util.Scanner;


public class Methods2 
{
	public static void main(String[] args) 
	{
		//asd(5);
		
		System.out.println("the number is: " + func1());
		System.out.println("the sum is: " + Add(6, 50));
		
		double sum = Add(60.1, 50);
		System.out.println(sum);
		//Add(34, 45);
		//79;
		
		//func1(); //5.5
		
		//5.5;
		System.out.println(Fn2(50));
		String s = Fn2(10);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CheckPrime(n);
	}
	
	public static void CheckPrime(int n)
	{
		boolean b = isPrime(n);
		
		//System.out.println(b == true ? "17 is prime" : "17 is not prime");
		
		if(b)
			System.out.println(n +" is prime");
		else
			System.out.println(n +" is not prime");
	}
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++) 
		{
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
	
	
	public static String Fn2(int a)
	{
		String s = "";
		for (int i = 0; i < a; i++) {
			s += "*";
		}
		
		return s;
	}
	
	public static double Add(double n1, int n2)
	{
		return n1 + n2;
	}
	
	public static int Add(int a, int b)
	{
		return a + b;
	}
	
	public static double func1()
	{
		return 5.5;
	}
	
	public static void asd(int a)
	{
		
	}
}
