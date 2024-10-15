
/*Three instance variables: String, double, and int types. (Name, GPA, Grade)
Two static variables: int counter, String schoolName
A custom constructor.
Getters and setters for all instance variables.  
.equals method.
compareTo method, with student-defined logic for ordering.
toString method
2 methods that use the static variables in some way (1 method should be to change the schoolName) 
*/

public class Student {
	private String name;
	private double gpa;
	private int grade;
	private static int counter;
	private static String schoolName;

	public Student(String name, double gpa, int grade) {
		this.name = name;
		this.gpa = gpa;
		this.grade = grade;
		counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Student s = (Student) o;
		return this.name.equals(s.name) && this.grade == s.grade && this.gpa == s.gpa;

	}

	public int compareTo(Student s) {
		if (this.name.compareTo(s.name) != 0) {
			return this.name.compareTo(s.name);
		} else if (this.gpa - s.gpa != 0) {
			return (int) (this.gpa - s.gpa);
		} else {
			return this.grade - s.grade;
		}
	}

	public String toString() {
		return "Name: " + name + ", GPA: " + gpa + ", Grade: " + grade;
	}

	public void changeSchoolName(String newName) {
		schoolName = newName;
	}

	public int getNumStudents() {
		return counter;
	}
}
