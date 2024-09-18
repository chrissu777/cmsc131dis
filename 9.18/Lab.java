import java.util.*;

public class Lab {
	public static void main(String[] args) {
		drawPatternedRectangle(6,8);
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
}
