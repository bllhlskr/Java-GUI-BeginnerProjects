import java.util.Random;
import java.util.Scanner;


public class Arrays2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//System.out.println(r.nextInt(49) + 1); //[0, 10) + 1
		//[0, 49) + 1
		
		int[] userNumbers = GetUserNumbers();
		PrintArray(userNumbers);
		int[] lotoNumbers = GenerateLotoNumbers();
		PrintArray(lotoNumbers);
	}
	
	public static int[] GenerateLotoNumbers()
	{
		int[] a = new int[6];
		
		Random r = new Random();
		
		for (int i = 0; i < a.length; i++) 
		{
			int number  = r.nextInt(49) + 1;
			
			if(Contains(a, number))
			{
				i--;
				continue;
			}
			
			a[i] = number;//[0, 49) + 1 = [1, 50)
		}
		
		return a;
	}
	
	
	public static void PrintArray(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	public static boolean Contains(int[] a, int number)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == number)
				return true;
		}
		return false;
	}
	
	public static int[] GetUserNumbers()
	{
		int[] a = new int[6];
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter #1");
		a[0] = sc.nextInt();
		
		System.out.println("Enter #2");
		a[1] = sc.nextInt();
		
		System.out.println("Enter #3");
		a[2] = sc.nextInt();
		*/
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter #"+(i+1));
			
			int number = sc.nextInt();
			
			boolean b = Contains(a, number);
			if(b == true)
			{
				i--;
				continue;
			}
			
			a[i] = number;
			if(a[i] < 1 || a[i] > 49)
				i--;
		}
		
		return a;
	}
}









