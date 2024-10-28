
public class Driver {
	/*Use the student class to do the following...
	 * Create an array of student objects with at least 5 elements
	 * Write a loop to perform a calculation using all Student objects
	 * average grade level, total gpa, etc..
	 * Print results of comparing each student to its neighbor using compareTo
	 * Find students with minimum and maximum gpa*/
	
	public static void main(String[] args) {
		Student[] students = new Student[5];
		for(int i = 0; i < 5; i++) {
			students[i] = new Student("Student " + i, i, 10);
		}
		
		double avgGpa = 0;
		for(int i = 0; i < 5; i++) {
			avgGpa += students[i].getGpa();
		}
		avgGpa /= 5;
		System.out.println("Average gpa: " + avgGpa);
		for(int i = 0; i < 4; i++) {
			int result = students[i].compareTo(students[i + 1]);
			System.out.println("Compared S" + i + " to S" + (i+1) +": "+ result);
		}
		double max = -1;
		double min = 6;
		for(int i = 0; i < 5; i++) {
			max = Math.max(max, students[i].getGpa());
			min = Math.min(min,  students[i].getGpa());
		}
		System.out.println("Max GPA: " + max);
		System.out.println("Min GPA: " + min);
	}
	
	
}
