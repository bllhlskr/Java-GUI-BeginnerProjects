
public class Control2_Incorrect2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double grade = 20;
		
		if(grade <= 60)
			System.out.println("you failed.");
		if(grade > 60)
			System.out.println("you got a D");
		if(grade > 70)
			System.out.println("you got a C");
		if(grade > 80)
			System.out.println("you got a B");
		else
			System.out.println("you got an A");
	}

}
