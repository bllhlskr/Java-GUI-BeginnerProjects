import java.util.Scanner;


public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("enter a number: ");
		int n = input.nextInt();
		
		if(n == 0 || n == 2 || n == 4 || n == 6 || n == 8)
			System.out.println("its an even number");
		else if(n == 1 || n == 3 || n == 5 || n== 7 || n == 9)
			System.out.println("its an odd number");
		else
			System.out.println("only a single digit is allowed");
		
		System.out.println("------------");
		switch(n)
		{
		case 0:  
		case 2: 
		case 4: 
		case 6: 
		case 8: System.out.println("its an even number"); break;
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 9: System.out.println("its an odd number"); break;
		default: System.out.println("only a single digit is allowed"); break;
		}
	}
}
