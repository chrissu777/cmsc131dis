
import java.lang.Math;

public class Lab2 {
	public static void main(String[] args) {
		System.out.println(sumNums(1, 3));
		System.out.println(sumNums(3, 1));

	}

	public static boolean verifyPassword(String password, int minLength) {
		boolean hasUpper, hasDigit;
		hasUpper = false;
		hasDigit = false;
		int length = password.length();

		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				hasUpper = true;
			}
			if (Character.isDigit(password.charAt(i))) {
				hasDigit = true;
			}
		}
		;
		return length > minLength && hasUpper && hasDigit;
	}

	public static void drawPatternedRectangle(int rows, int columns) {
		if (rows <= 0 || columns <= 0) {
			System.out.println("Invalid Parameters");
		} else {
			for (int i = 0; i < rows; i++) {
				for (int j = 1; j <= columns; j++) {
					if (j % 3 == 0) {
						System.out.print("*");
					} else {
						System.out.print("$");
					}
				}
				System.out.println();
			}
		}
	}

	public static String findYoungest(int child1, int child2, int child3) {

		int youngest = child1;
		if (child2 < youngest) {
			youngest = child2;
		}
		if (child3 < youngest) {
			youngest = child3;
		}
		// int youngest = Math.min(Math.min(child1, child2), child3);
		return ("Your youngest child is " + youngest + " years old");
	}

	public static double sumNums(int start, int end) {
		if(end < start) {
			return (double)(-1);
		}
		double result = 0;
		for (int i = start; i <= end; i++) {
			result += i;
		}
		return result;
	}
}
