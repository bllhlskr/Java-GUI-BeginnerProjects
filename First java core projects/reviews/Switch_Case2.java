import java.util.Scanner;


public class Switch_Case2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int ex1 = 90, ex2 = 90, ex3 = 90, ex4 = 60, ex5 = 45;
		
		double grade = (ex1 +ex2+ex3+ex4+ex5) / 5; //62
		System.out.println(grade);
		char letter;
		
		if(grade > 90)
		{
			letter = 'A';
		}
		else if(grade > 80)
		{
			letter = 'B';
		}
		else if(grade > 70)
		{
			letter = 'C';
		}
		else if(grade > 60)
			letter = 'D';
		else
			letter = 'F';
		
		
		if(letter == 'A')
			System.out.println("well done! bravo!");
		else if (letter == 'B')
			System.out.println("ok but can be improved. ");
		else if(letter == 'C')
			System.out.println("average");
		else if(letter == 'D')
			System.out.println("youre gonna fail at some point");
		else// if(letter == 'F')
			System.out.println("you already failed. ");
		System.out.println("---------------");
		switch(letter)
		{
		case 'A': System.out.println("well done! bravo!"); break;
		case 'B': System.out.println("ok but can be improved. ");break;
		case 'C': System.out.println("average"); break;
		case 'D': System.out.println("youre gonna fail at some point");break;
		default: System.out.println("you already failed. "); 
		}
		
	}
}





