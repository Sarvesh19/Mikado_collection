import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sarvesh
 * 
 */
public class FindMaxNumberInList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer[] arrOfNum = new Integer[n];

		System.out.println("plz enter " + n + " numbers");
		for (Integer i = 0; i < n; i++) {
			arrOfNum[i] = sc.nextInt();
		}

		Integer max_num = arrOfNum[0];
		for (int i = 1; i < arrOfNum.length; i++) {
			if (max_num < arrOfNum[i]) {
				max_num = arrOfNum[i];
			}
		}
		System.out.println(max_num);
	}
}
