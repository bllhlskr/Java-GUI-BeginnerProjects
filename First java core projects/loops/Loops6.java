import java.util.Scanner;


public class Loops6 
{
	public static void main(String[] args) {
		
    
		Scanner sc = new Scanner(System.in);
		System.out.println("how many columns do you wanna see?");
		int col = sc.nextInt();
		
		System.out.println("how many rows?");
		int row = sc.nextInt();
		
		for(int k = 0; k < row; k++)
		{
			for(int i = 0; i< col; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}





