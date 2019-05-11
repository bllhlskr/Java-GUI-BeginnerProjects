
public class Loops_Reviewed 
{
	public static void main(String[] args) 
	{
		/*
		System.out.println("hi!");
		System.out.println("hi!");
		System.out.println("hi!");
		System.out.println("hi!");
		System.out.println("hi!");
		*/
		int c = 15;
		while(c < 5)
		{
			System.out.println("hi from while!");
			c++;
		}
		System.out.println(c);
		
		System.out.println("---------------");
		//control - execute- update
		for(c = 15; c<5; c++)
			System.out.println("hi from for!");
		

		System.out.println(c);
		
		System.out.println("---------------");
		
		c = 15;
		do
		{
			System.out.println("hi from do-while!");
			c++;
		}
		while(c < 5);
		System.out.println(c);
	}
}





