import java.util.*;

public class Rectangles {
	/*
	 * Rectangle1 – Draws a rectangle after providing the number of rows and
	 * columns. Every column must use a different character. Rectangle2 – Draws a
	 * rectangle with two stripes of characters (the first half of the rectangle
	 * relies on one character and the second one on another character. Indicate we
	 * could have used two inner loops, where each one draws a stripe. Rectangle3 –
	 * Modified version of first example where characters alternate by row.
	 */

	public static void main(String[] args) {
		String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		/* Rectangle1 */
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i < 3) {
					System.out.print("A");
				} else {
					System.out.print("B");
				}
			}
			System.out.println();
		}

		/* Rectangle2 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(charSet.charAt(i));
			}
			System.out.println();
		}

		/*
		 * BONUS to do together: Triangle – Draws triangle showing that we need 
		 * to print the empty character to make the triangle empty on the left side.
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
