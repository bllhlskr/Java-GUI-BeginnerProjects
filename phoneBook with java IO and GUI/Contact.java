package fileIO;

import java.io.Serializable;

public class Contact implements Serializable{
	String name;
	String phoneNumber;
	

	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber= phoneNumber;
	}




	public String toString() {
		//return name + "\t" + phonenumber + "\n";
		return String.format("%s\t%s\n",name,phoneNumber);
	}

}
