import java.util.Random;


public class MultiDimensionalArrays 
{
	public static void main(String[] args) 
	{
		double[][] java_grades = new double[10][4];
		/*
		 * 0-> q1
		 * 1-> m
		 * 2-> q2
		 * 3-> final
		 */

		java_grades[0][0] = 35; //15%
		java_grades[0][1] = 45; //30%
		java_grades[0][2] = 80; //15%
		java_grades[0][3] = 50; //40%
		
		java_grades[1][0] = 30; //15%
		java_grades[1][1] = 67; //30%
		java_grades[1][2] = 90; //15%
		java_grades[1][3] = 20; //40%
		Random r = new Random();
		for(int student = 0; student < 10; student++)
		{
			/*
			java_grades[student][0] = 30; //15%
			java_grades[student][1] = 67; //30%
			java_grades[student][2] = 90; //15%
			java_grades[student][3] = 20; //40%
			*/
			for (int exam = 0; exam < 4; exam++) 
			{
				java_grades[student][exam] = r.nextInt(100);
			}
		}
		
		for (int student = 0; student < 10; student++) 
		{
			double avg = java_grades[student][0]*0.15+java_grades[student][1]*0.3
					+java_grades[student][2]*0.15+java_grades[student][3]*0.4;

			if(avg < 50)
				System.out.println(avg + "-> failed");
			else
				System.out.println(avg);
		}
		/*
		double avg0 = java_grades[0][0]*0.15+java_grades[0][1]*0.3
				+java_grades[0][2]*0.15+java_grades[0][3]*0.4;
		double avg1 = java_grades[1][0]*0.15+java_grades[1][1]*0.3
				+java_grades[1][2]*0.15+java_grades[1][3]*0.4;
		System.out.println(avg0);
		System.out.println(avg1);
		*/
	}
}
