
import java.util.Scanner;

public class MaxDouble {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double v1, v2, v3;

		System.out.print("Enter double: ");
		v1 = scn.nextDouble();
		System.out.print("Enter double: ");
		v2 = scn.nextDouble();
		System.out.print("Enter double: ");
		v3 = scn.nextDouble();

		double max = 0;
		if (v1 > max) {
			max = v1;
		}
		if (v2 > max) {
			max = v2;
		}
		if (v3 > max) {
			max = v3;
		}
		
		System.out.println("Max: " + max);
	}

}
