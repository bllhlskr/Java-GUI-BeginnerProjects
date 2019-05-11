package pack;
public class Course {
	private String courseCode;
	private String courseName;
	private int MAX_STUDENT = 3;
	private Student[] students = new Student[MAX_STUDENT]; 

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public boolean addStudent(Student stu) {
		boolean isStudentAdded = false;

		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				isStudentAdded = true;
				break;
			}
		}

		return isStudentAdded;
	}

	public void clearStudents() {
		for (int i = 0; i < students.length; i++) {
			students[i] = null;
		}
	}

	public boolean removeStudent(Student stu) {
		boolean isStudentRemoved = false;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId().equals(stu.getId())) {
				students[i] = null;
				isStudentRemoved = true;
				//Do not break, there can be other references for the same student.
			}
		}

		return isStudentRemoved;
	}

	public void setSize(int newSize) {
		if (newSize > students.length) {
			Student[] temp = new Student[students.length];
			System.arraycopy(students, 0, temp, 0, students.length);
			MAX_STUDENT = newSize;
			students = new Student[MAX_STUDENT];
			System.arraycopy(temp, 0, students, 0, temp.length);
		}
	}

	public int getStudentCount() {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null)
				count++;
		}
		return count;
	}

	public boolean findStudent(Student stu) {
		boolean isStudentFound = false;

		for (int i = 0; i < students.length; i++) {
			if(students[i] != null && students[i].getId().equals(stu.getId())) {
				isStudentFound = true;
				break;
			}
		}
		
		return isStudentFound;
	}

	public Course(String courseCode, String courseName) {
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public String toString() {
		String output = String.format("%s - %s (Students enrolled: %s | Available space: %s)\n", 
				        this.courseCode, this.courseName, getStudentCount(), students.length - getStudentCount());
		for (Student s : students) {
			if (s != null)
				output += String.format(" * %s\n", s);
		}

		return output;
	}

}
