
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] b = new int[5];
		//FillArray(a);
		ExamReview.FillArray(b);
		ExamReview.PrintArray(b);
		BubbleSort(b);
		ExamReview.PrintArray(b);
		
		System.out.println("----------");
	}
	public static void asd()
	{
		System.out.println("jkahsdjkahsd");
	}
	
	public static void BubbleSort(int[] a)
	{
		/*
		if(a[0] > a[1]) ;
			//swap
		if(a[0] > a[2]);
		//swap
		if(a[0] > a[3]);
		//swap
		 * 
		 */
		for(int member = 0; member < a.length; member++)
		{
			for(int i = member+1; i < a.length; i++)
			{
				if(a[member] > a[i])
				{
					//swap
					int temp = a[member];
					a[member] = a[i];
					a[i] = temp;
				}
			}
		}
		/*
		for(int i = 1; i < a.length; i++)
		{
			if(a[0] > a[i])
			{
				//swap
				int temp = a[0];
				a[0] = a[i];
				a[i] = temp;
			}
		}
		
		for(int i = 2; i < a.length; i++)
		{
			if(a[1] > a[i])
			{
				//swap
				int temp = a[1];
				a[1] = a[i];
				a[i] = temp;
			}
		}
		
		for(int i = 3; i < a.length; i++)
		{
			if(a[2] > a[i])
			{
				//swap
				int temp = a[2];
				a[2] = a[i];
				a[i] = temp;
			}
		}
		*/
	}
}





