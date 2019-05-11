import java.util.Random;


public class Review 
{
	
	public static void main(String[] args) 
	{
		Random r = new Random();
		int[] q1 = new int[10];
		int[] q2 = new int[10];
		int[] midterm = new int[10];
		int[] f = new int[10];
	
		for(int i = 0; i < q1.length; i++)
		{
			q1[i] = r.nextInt(96) + 5; //[5, 101)
			q2[i] = r.nextInt(96) + 5; //[5, 101)
			midterm[i] = r.nextInt(96) + 5; //[5, 101)
			f[i] = r.nextInt(96) + 5; //[5, 101)
			System.out.println(q1[i] + "\t" +q2[i] +"\t" + midterm[i] + "\t" + f[i]);
		}
	}
	
	

}
