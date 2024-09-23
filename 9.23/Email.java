import java.util.*;
public class Email {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("email: ");
		String email = scn.nextLine();
		validateEmail(email);
		scn.close();
	}
	/* Does the parameter contain
	 * an @ character
	 * a .com or .edu in a position AFTER the @ character
	 * If it does not contain both @ and .com/.edu then it adds @umd.edu
	 * Otherwise prints an error message and returns original parameter
	 */
	public static String validateEmail(String email) {
		if(email == null || email.isEmpty()) {
			System.out.println("Invalid parameter");
			return email;
		}
		int atIdx = email.indexOf('@');
		if(atIdx == -1) {
			System.out.println("Invalid email, @umd.edu added");
			return email + "@umd.edu";
		}
		if(atIdx == email.length() - 1) {
			System.out.println("Invalid email");
			return email;
		}
		String domain = email.substring(atIdx + 1);
		if(!domain.contains(".com") && !domain.contains(".edu")) {
			System.out.println("Invalid email.");
			return email;
		}
		System.out.println("Good email");
		return email;
	}
}
