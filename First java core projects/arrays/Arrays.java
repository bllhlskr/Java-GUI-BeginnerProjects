import java.util.Scanner;


public class Arrays 
{
	public static int GetMember()
	{
		System.out.println("Enter a number between [1, 100]: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void GetAllMembers(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			a[i] = GetMember();
			if(a[i] < 1 || a[i] > 100)
			{
				System.out.println("wrong input. ");
				i--;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		GetAllMembers(a);
		
		/*a[0] = GetMember();
		a[1] = GetMember();
		a[2] = GetMember();
		a[3] = GetMember();
		a[4] = GetMember();*/
		
		
		
		PrintIntegerArray(a);
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		
		/*
		for(int i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		String[] b = {"duygu", "abdulrahman", "omer", "oguz"}; //new String[4];
		PrintStringArray(b);
/*
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		//System.out.println(b[4]);
		*/
		/*
		for(int i = 0; i < 4; i++)
		{
			System.out.println(b[i]);
		}*/
	}
	
	public static void PrintStringArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	public static void PrintIntegerArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
}






