
public class Control5 
{
	public static void main(String[] args) 
	{
		int number = 1;
		
		while(number <= 100) //while loop -> if (....) repeat { ... }
		{
			if(number % 6 == 0)
				System.out.println(number + " is divisible by 6");
			else 
				System.out.println(number + " is NOT divisible by 6");
			
			//number = number + 1; //update
			//number += 1;
			number++;		
		}
		System.out.println(number);
		
		/*
		int number = 1;
		
		if(number % 6 == 0)
			System.out.println(number + " is divisible by 6");
		else 
			System.out.println(number + " is NOT divisible by 6");
		
		number = 2;
		if(number % 6 == 0)
			System.out.println(number + " is divisible by 6");
		else 
			System.out.println(number + " is NOT divisible by 6");
		
		number = 3;
		if(number % 6 == 0)
			System.out.println(number + " is divisible by 6");
		else 
			System.out.println(number + " is NOT divisible by 6");
		*/
	}
}
