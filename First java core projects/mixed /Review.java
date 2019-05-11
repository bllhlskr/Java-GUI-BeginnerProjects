import java.util.Random;
import java.util.Scanner;


public class ExamReview 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an array dimension: ");
		int dimension = sc.nextInt();
		DrawShape(dimension);
		int[] a = new int[dimension];
		
		PrintArray(a);
		FillArray(a);
		PrintArray(a);
		
		System.out.println("-----------");
		System.out.println("how many numbers do you want to generate");
		int numOfDigits =  sc.nextInt();
		
		System.out.println("what's gonna be the max number:");
		int max = sc.nextInt();
				
		Generate(numOfDigits, max);
		
		System.out.println("------------");
		
		for(int i = 1; i <= 100; i *= 2)
		{
			/*
			 * 1 2 4 8 16 32 64
			 */
		}
	}
	
	private static void DrawShape(int dimension) 
	{
		for (int i = 1; i <= dimension; i++) 
		{
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < dimension-i; j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
		
	}

	public static void Generate(int numbers, int max)
	{
		Random r = new Random();
		
		for (int i = 0; i < numbers; i++) 
		{
			System.out.print(r.nextInt(max+1) + "\t");
		}
	}
	
	public static void FillArray(int[] a)
	{
		Random r = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(19)+1; //[1, 20) -> [1, 20)
		}
	}
	
	public static void PrintArray(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
}



