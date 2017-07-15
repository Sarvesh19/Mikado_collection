import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sarvesh
 * 
 */
public class HourGlass2DArray {
	public static void main(String[] args) {
		int sum = 0, max_num = -9, count = 0;
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
						+ arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				if (count == 0) {
					count++;
					max_num = sum;

				}

				if (sum > max_num) {
					max_num = sum;
				}
			}
		}
		System.out.println(max_num);

	}
}
