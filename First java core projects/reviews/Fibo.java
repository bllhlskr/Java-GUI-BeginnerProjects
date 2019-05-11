
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2= 1;
		 
		for (int i = 0; i < 20; i++) {
			System.out.println(n1);
			int fibo = n1 + n2;

			n1 = n2;
			n2 = fibo;
		}
		
		
		
		
		
	}

}
