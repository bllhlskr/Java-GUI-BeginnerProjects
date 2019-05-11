
public class Control2_Incorrect {
	public static void main(String[] args) {
		
		double grade = 89;
		
		if(grade <= 60)
			System.out.println("you failed.");
		else if(grade > 60)
			System.out.println("you got a D");
		else if(grade > 70)
			System.out.println("you got a C");
		else if(grade > 80)
			System.out.println("you got a B");
		else
			System.out.println("you got an A");
	}
}
