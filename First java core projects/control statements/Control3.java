
public class Control3 {

	public static void main(String[] args) {
		
		int number = 2341;
		
		if(number % 5 == 0)
			System.out.println(number + " is divisible by 5");
		else
			System.out.println(number + " is NOT divisible by 5. the remainder is: " + number % 5);
		
		if(number % 2 == 0)
			System.out.println(number + " is an EVEN number");
		else
			System.out.println(number + " is an ODD number");
		
		//if(number % 6 == 0)
		if(number % 2 == 0 && number % 3 == 0)
			System.out.println(number  + " is divisible by 6");
		else
			System.out.println(number  + " is NOT divisible by 6");
		
		
		if(number % 7 != 0)
			System.out.println(number + " is NOT divisible by 7");
		
		String teacher = "duygu";
		
		if(teacher == "duygu")
			System.out.println("hooray!");
		else 
			System.out.println("meeeh...");
		
	}
}
