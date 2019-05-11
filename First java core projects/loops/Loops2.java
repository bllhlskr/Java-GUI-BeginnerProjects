import java.util.Scanner;


public class Loops2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give me a lower bound: ");
		int lowerBound = sc.nextInt();
		
		System.out.println("give me an upper bound: ");
		int upperBound = sc.nextInt();
		
		System.out.println("give me a number to check the divisibility");
		int n = sc.nextInt();
		
		while(lowerBound <= upperBound)
		{
			if(lowerBound % n == 0)
				System.out.println(lowerBound + " is divisible by "+n);
			else
				System.out.println(lowerBound + " is NOT divisible by "+n);
			lowerBound++;
		}
		
	}
}






