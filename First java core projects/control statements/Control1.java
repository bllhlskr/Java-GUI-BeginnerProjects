
public class Control1 
{
	public static void main(String[] args) 
	{
		double radius = 5.5;
		
		if(radius <= 0)
		{
			System.out.println("incorrect radius: " + radius);
		}
		else
		{
			double area = radius * radius * Math.PI;
			System.out.println("the area of the circle with a radius " + radius + " is " + area);
		}
	}
}




