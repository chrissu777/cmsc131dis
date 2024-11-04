
import java.util.Arrays;

public class TwoDArrays {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(lineExists(arr));
	}

	public static boolean lineExists(int[][] arr) {
	    int numRows = arr.length;
	  	int numCols = arr[0].length;

	    for (int col = 0; col < numCols; col++) {
	        int init = arr[0][col];
	        boolean found = true;

	        for (int row = 1; row < numRows && found; row++) {
	            if (arr[row][col] != init) {
	                found = false;
	            }
	        }
	        if (found) {
	            return true;
	        }
	    }
	    return false;
	}

	public static void rotate(int[][] arr, boolean direction, int steps, int row) {
		for (int i = 0; i < steps; i++) {
			rotateSingle(arr[row], direction);
		}
	}

	public static void rotateSingle(int[] arr, boolean direction) {
		if (direction) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		} else {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
		}
	}

}
