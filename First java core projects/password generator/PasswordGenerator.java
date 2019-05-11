import java.util.ArrayList;
import java.util.Random;


public class PasswordGenerator 
{
	public static void main(String[] args) 
	{
		// System.out.println((int)'a');
		
		
		ArrayList<String> passwords = new ArrayList<String>();
		
		passwords.add(GeneratePassword());
		passwords.add(GeneratePassword());
		passwords.add(GeneratePassword());
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(passwords.get(i));
		}
		System.out.println("-----------");
		for(String s : passwords)
		{
			System.out.println(s);
		}
		
	}
	
	public static String GeneratePassword()
	{
		char[] symbols = {'!', '@', '*', '?', '#'};		
		char[] lower = new char[26];
		for (int i = 0; i < lower.length; i++) {
			lower[i] = (char)('a' + i);
		}
		char[] upper = new char[26];
		for (int i = 0; i < upper.length; i++) {
			upper[i] = (char)('A' + i);
		}
		
		Random r = new Random ();
		
		String P = "";
		for (int i=0; i<5; i++){
			int S = r.nextInt(4);
			
		
		switch (S) {
		case 0: P += r.nextInt(10);
		
			
			break;
		case 1: P += symbols[r.nextInt(symbols.length)];
		break;
		
		case 2: P += lower[r.nextInt(lower.length)];
		break;

		case 3: P += upper[r.nextInt(upper.length)];
		break;
		
		default:
			break; }
			
			
		}
		//System.out.println(P);
		return P;
		
	}
}
