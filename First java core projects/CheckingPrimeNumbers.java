package week5;

import java.util.Scanner;

public class CheckingPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner   scan =new Scanner(System.in);
   System.out.println("enter some number");
   int number = scan.nextInt();
   if (number <= 1) {
	   System.out.println("enter a number greater then 2");}
   int i = 2;
   boolean a = false;
	while( i < number) {
		if(number % i == 0)
			a=true;
			i++;
		
	}
		 if(a == true) 
			 System.out.println("number is not prime");
		 else
			 System.out.println("number is prime");
	}
  }
	

		   
		  
		  
		
		
		
	
	
	
	
	


