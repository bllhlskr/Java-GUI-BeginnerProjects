
public class Methods1 
{
	
	public static void main(String[] args) 
	{
		Method2();
		System.out.println("--------");
		Method1();
		System.out.println("--------");
		Method3(3); //method call
		System.out.println("--------");
		Method4(4, 3.5);
		System.out.println("--------");
		Method5("@", 4, 5);
		System.out.println("--------");
		Method5("x", 4, 5);
		System.out.println("--------");
		Method6('*', 5);
		System.out.println("--------");
		Func('*', 5);
		System.out.println("--------");
		Func2('x', 5);
		System.out.println("--------");
		AddNumbers(3.4, 5.0);
		System.out.println("--------");
		Operation('+', 4, 60);
		Operation('-', 4, 60);
		Operation('*', 4, 60);
		Operation('/', 4, 60);
		Operation('f', 4, 60);
		
		Asd(5, 6);
	}
	public static void Asd(double n1, double n2)
	{
		AddNumbers(n1, n2);
		Operation('-', n1, n2);
		Operation('-', n2, n1);
	}
	
	public static void AddNumbers(double d1, double d2)
	{
		System.out.println("The sum is: " + (d1 + d2));
	}
	
	public static void Operation(char operator, double num1, double num2)
	{
		switch(operator)
		{
		case '+': 
			//System.out.println("The sum is: " + (num1 + num2));
			AddNumbers(num1, num2); //4, 60
			break;
		case '-': 
			System.out.println("The result is: " + (num1 - num2));
			break;
		case '*': 
			System.out.println("The result is: " + (num1 * num2));
			break;
		case '/': 
			System.out.println("The result is: " + (num1 / num2));
			break;
		default:
			System.out.println("wrong operator. ");
		}
	}
	
	public static void Func2(char c, int a)
	{
		for (int i = 0; i < a; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < a-i; j++) 
			{
				System.out.print(c);
			}
			
			System.out.println();
		}
	}
	public static void Func(char c, int a)
	{
		for (int i = 0; i < a; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print("_");
			}
			for (int j = 0; j < a; j++) 
			{
				System.out.print(c);
			}
			
			System.out.println();
		}
	}
	
	public static void Method6(char c, int n)
	{
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void Method5(String s, int r, int c)
	{
		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	public static void Method4(int a, double d)
	{
		for (int i = 0; i < a*d; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void Method3(int a)
	{
		for (int i = 0; i < a; i++) {
			System.out.println("whats up!");
		}
	}
	
	
	public static void Method2()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("hello!");
		}
	}
	
	public static void Method1() //parameter list
	{
		System.out.println("hi!");
	}
}
