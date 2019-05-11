
public class InLineIf 
{
	public static void main(String[] args) 
	{
		int ygs = 220;
		/*
		if(ygs > 180)
			System.out.println("you passed");
		else
			System.out.println("you failed");
		*/
		//INLINE IF --> control ? true_case : false_case
		System.out.println(ygs > 180 ? "you passed" : "you failed");
		
		int number = 23423;
		
		System.out.println(number % 2 == 0 ? "even" : "odd");
	}
}
