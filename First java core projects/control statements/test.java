
public class test 
{ //inside class scope
	public static void main(String[] args) 
	{ //main scope 
		int age = 45;
		String name = "Duygu";
		//F M
		char gender = 'F';
		boolean prevSurgeries = false;
		
		System.out.println(name + " is "+age+" years old");
		
		if(prevSurgeries == true)
		{
			if(gender == 'F')
				System.out.println("She will recover very soon.");
			else
				System.out.println("He will recover very soon.");;
		}
		else
		{
			if(gender == 'F')
				System.out.println("She never had any surgeries");
			else
				System.out.println("He never had any surgeries");;
		}
	}
}
