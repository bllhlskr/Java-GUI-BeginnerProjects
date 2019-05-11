import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a value: ");
		        int number = scanner.nextInt();
		        System.out.print("Number of places : ");
		        int number_of_places = scanner.nextInt();
		        
		        int tempNumber= number;
		        int toplam = 0;
		        
		        do {
		            int Digit_value = tempNumber % 10;
		            gecici_sayi /= 10;

		            sum += Math.pow(Digit_value,number_of_places);
		            
		        }while(tempNumber > 0);
		        
		        if (number == sum) {
		            
		            System.out.println("This is an Armstrong number...");
		        }
		        else {
		            System.out.println("This is not an Armstrong number...");
		        }
		        
		        
		        
		    }
		}
