import java.util.Scanner;


public class Loops1 {

	public static void main(String[] args) {
		
		/*
		 * variable declaration & initialization: 
		 * type nickname = initial value
		 * 
		 * primitive data types: 
		 * int a = 5;
		 * double d = 5.5;
		 * char c = 'D';
		 * String s = "duygu cakir";
		 * boolean b = true; //false
		 * 
		 */
		//
		Scanner sc=new Scanner(System.in);
		
		System.out.println("give me a number: ");
		int number = sc.nextInt();
		
		int n = 1;
		while(n <= number)
		{
			if(n % 5 == 0)
				System.out.println(n + " is divisible by 5");
			else
				System.out.println(n + " is NOT divisible by 5");
			
			//n = n + 1;
			//n++;
			n += 1;
		}
		/*
		if(n % 5 == 0)
			System.out.println(number + " is divisible by 5");
		else
			System.out.println(number + " is NOT divisible by 5");
		
		n = 2;
		if(n % 5 == 0)
			System.out.println(number + " is divisible by 5");
		else
			System.out.println(number + " is NOT divisible by 5");
		
		n = 3;
		if(n % 5 == 0)
			System.out.println(number + " is divisible by 5");
		else
			System.out.println(number + " is NOT divisible by 5");
		
		n = 4;
		if(n % 5 == 0)
			System.out.println(number + " is divisible by 5");
		else
			System.out.println(number + " is NOT divisible by 5");
		*/
		
	}

}





