import java.util.Scanner;


public class Switch_Case3 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the first number: ");
			double number1 = sc.nextDouble();

			System.out.println("enter the second number: ");
			double number2 = sc.nextDouble();
			
			System.out.println("+ \t- \t* \t/ ");
			int ch = sc.nextInt();
						
			switch (ch) {
			case 1:
				System.out.println("the answer is : " + (number1 + number2));
				break;
			case 2:
				System.out.println("the answer is : " + (number1 - number2));
				break;
			case 3:
				System.out.println("the answer is : " + (number1 * number2));
				break;
			case 4:
				System.out.println("the answer is : " + (number1 / number2));
				break;

			default:
				System.out.println("invalid operator");
				break;
			}
		}
	}
}








