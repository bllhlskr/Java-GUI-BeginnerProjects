
public class Perfect {

	
	 
	public static void main(String[] args) {
	for (int n = 1; n < 1000000; n++) {
		
		int sum = 0;
		
		for (int i = 1; i <= n/2; i++) {
			if(n % i == 0) 
				sum+= i;
				
		}
		
		
		
		
		if (sum == n)
			System.out.println(n + "is a perfect number");	
	}
		
		

	}

}
