package dis;

import java.util.Scanner;

public class IncreasingSequence {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1, v2, v3;
		System.out.print("Enter value: ");
		v1 = scn.nextInt();
		System.out.print("Enter value: ");
		v2 = scn.nextInt();
		System.out.print("Enter value: ");
		v3 = scn.nextInt();
		
		if(v2 > v1 && v3 > v2) {
			System.out.println("Increasing");
		}else {
			System.out.println("Not increasing");
		}
	}
}
