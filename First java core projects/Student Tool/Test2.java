package pack;
public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student("Chad", "Watson");
		Student s2 = new Student("James", "Davis", 2.1);
		Student s3 = new Student("Julie", "Campbell", 2.51);
		Student s4 = new Student("Tony", "Hills", 3.389);
		Student s5 = new Student("Lisa", "Gold", 2.8674);
		
		Course sen1001 = new Course("SEN1001", "Intoduction to Programming (Java)");
		Course mat1051 = new Course("MAT1051", "Calculus I");
		
		sen1001.addStudent(s1);
		sen1001.addStudent(s2);
		sen1001.addStudent(s3);
		System.out.println(sen1001);
		
		mat1051.addStudent(s1);
		mat1051.addStudent(s2);
		mat1051.addStudent(s3);
		System.out.println(mat1051);

		System.out.println("Increasing size to 7.");
		mat1051.setSize(7);
		System.out.println(mat1051);
		mat1051.addStudent(s4);
		mat1051.addStudent(s5);
		System.out.println(mat1051);

		System.out.println("Removing student s2: " + s2.getFullName());
		mat1051.removeStudent(s2);
		System.out.println(mat1051);

		mat1051.clearStudents();
		System.out.println("After removing all students from MAT1051 course:");
		System.out.println(mat1051);
		
		Course course = sen1001;
		Student student = s2;
		
		if(course.findStudent(student))
			System.out.printf("%s takes %s.", student.getFullName(), course.getCourseName());
		else
			System.out.printf("%s does not take %s.", student.getFullName(), course.getCourseName());
			
	}

}
