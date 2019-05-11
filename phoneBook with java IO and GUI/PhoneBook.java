package fileIO;
import java.io.*;
import java.util.Scanner;
public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name and phone number");
		 Contact contact = new Contact(sc.next(),sc.next());
		 String name = null ;
		
		 
		 File file = new File("Phonebook.txt");
		 
		 try {
			 FileWriter fw = new FileWriter (file,true);
			
			 fw.write(contact.toString());// writes in the file
			 fw.flush();// cleaning the byte stream
			 fw.close();
			 System.out.println("contact is saved:  " + file.getName());
		 }catch(IOException e) {
			 e.printStackTrace();
			 
		 }
		 try {
			 Scanner reader = new Scanner(file);
			 System.out.println("contact List : ");
			 while(reader.hasNext() ){
				 String record = reader.nextLine();
				 String[] properties = record.split("[\t]{1}");
				 System.out.format("name:%s phone number :%S\n",properties[1],properties[2]);
				 
			 
				 
			 }
			 System.out.println("end of line");
			 
		 }catch(FileNotFoundException e ){
			 e.printStackTrace();
			 
		 }
		
		
		
		
		
		
		
		
	}

}
