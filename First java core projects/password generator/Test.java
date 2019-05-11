import java.util.ArrayList;
import java.util.Random;


public class Test 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name = "Beril";
		s1.id = 453627;
		s1.password = PasswordGenerator.GeneratePassword();
		
		Student s2 = new Student();
		s2.name = "Nurcin";
		s2.id = 345345;
		s2.password = PasswordGenerator.GeneratePassword();
		
		Student s3 = new Student();
		s3.name = "Altug";
		s3.id = 8768454;
		s3.password = PasswordGenerator.GeneratePassword();
		
		ArrayList<Student> java01section = new ArrayList<Student>();
		java01section.add(s1);
		java01section.add(s2);
		java01section.add(s3);
		
		for(Student s : java01section)
		{
			//System.out.println(s.name + "\t" + s.id + "\t" + s.password);
			s.PrintStudent();
		}
	}
}




