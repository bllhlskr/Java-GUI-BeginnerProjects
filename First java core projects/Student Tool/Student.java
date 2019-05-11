package pack;
public class Student {
	private Name fullName;
	private double gpa;
	private String id;

	public Name getFullName() {
		return fullName;
	}

	public void setFullName(Name fullName) {
		this.fullName = fullName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public Student(String firstName, String lastName) {
		this.id = ToolKit.generateId(7);
		this.fullName = new Name(firstName, lastName);
	}
	
	public Student(String firstName, String lastName, double gpa) {
		this.id = ToolKit.generateId(7);
		this.fullName = new Name(firstName, lastName);
		this.gpa = gpa;
	}
	
	public String toString() {
		if (gpa > 0)
			return String.format("%s - %s (GPA: %.2f)", this.id, this.fullName, this.gpa);
		else
			return String.format("%s - %s (GPA: ---)", this.id, this.fullName);
	}

}
