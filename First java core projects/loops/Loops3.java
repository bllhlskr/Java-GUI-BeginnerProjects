import java.util.Scanner;


public class Loops3 
{
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("give me a lower bound to start with: ");
		int number = reader.nextInt();
		
		System.out.println("give me a upper bound to go up to: ");
		int upper = reader.nextInt();
		
		while(number > upper)
		{
			//if()
			{
				System.out.println("invalid input. ");
				
				System.out.println("give me a lower bound to start with: ");
				number = reader.nextInt();
				
				System.out.println("give me a upper bound to go up to: ");
				upper = reader.nextInt();
			}
		}
		
		System.out.println("give me a number to check the divisibility with: ");
		int divisor = reader.nextInt();
		
		while(number <= upper)
		{
			if(number % divisor == 0)
				System.out.println(number + " is divisible by "+divisor);
			else
				System.out.println(number + " is NOT divisible by "+divisor);
			
			number++;
		}
		
	}
}
