
public class Control4 {

	public static void main(String[] args) {
		
		int n = 18;
		if((n % 2 == 0 || n % 3 == 0) && n % 6 != 0)
			System.out.println("correct!");
		else
			System.out.println("incorrect");
	}
}
