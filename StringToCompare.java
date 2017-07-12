import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sarvesh
 * 
 */
public class StringToCompare {
	public static void main(String[] args) {
		// String s1 = "Sarvesh";
		// String s2 = "sarvesh";
		String yesOrNo = "yes";
		Scanner sc = new Scanner(System.in);

		while (yesOrNo.equalsIgnoreCase("yes")) {
			System.out.println("plz enter two string to compare :");

			String s1 = sc.next();
			String s2 = sc.next();

			if (s1.compareTo(s2) < 0) {
				System.out.println(s1 + " comes FIRST(Alphabatically) than "
						+ s2);
				System.out.println("Enter yes start again or no to shutdown ");
				yesOrNo = sc.next();
			} else {
				System.out.println(s2 + " comes FIRST(Alphabatically) than "
						+ s1);
				System.out.println("Enter yes start again or no to shutdown ");
				yesOrNo = sc.next();
			}
		}

		if (yesOrNo.equalsIgnoreCase("no")) {
			System.out.println("System Shutdown! Thank you!!!");
			System.exit(1);
		}

		sc.close();

	}
}
