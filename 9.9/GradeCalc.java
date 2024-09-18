import java.util.*;

public class GradeCalc {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double grade1, grade2;

		System.out.print("Enter grade:");
		grade1 = scn.nextDouble();
		System.out.print("Enter grade: ");
		grade2 = scn.nextDouble();

		double avg = (grade1 + grade2) / 2;
		System.out.println("Average: " + avg);
		if (avg > 100 || avg < 0) {
			System.out.println("Invalid input");
		} else if (avg >= 90) {
			System.out.println("Grade: A");
		} else if (avg >= 80) {
			System.out.println("Grade: B");
		} else if (avg >= 70) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F");
		}
	}
}
