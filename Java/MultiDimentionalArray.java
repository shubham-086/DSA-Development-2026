import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {

	static void printSpiral(int arr[][], int rows, int cols) {
		int top = 0;
		int bottom = rows - 1;
		int left = 0;
		int right = cols - 1;

		while (top <= bottom && left <= right) {
			// left -> right
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;

			// top -> bottom
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;

			// right -> left
			for (int i = right; i >= left; i--) {
				System.out.print(arr[bottom][i] + " ");
			}
			bottom--;

			// bottom -> top
			for (int i = bottom; i >= top; i--) {
				System.out.print(arr[i][left] + " ");
			}
			left++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// System.out.println("Enter array elements: ");
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr.length; j++) {
		// arr[i][j] = sc.nextInt();
		// }
		// }
		// System.out.println(Arrays.deepToString(arr));

		// for (int j = 0; j < arr.length; j++) {
		// int colSum = 0;
		// for (int i = 0; i < arr.length; i++) {
		// colSum = colSum + arr[i][j];
		// }
		// System.out.println(colSum);
		// }

		printSpiral(arr, 4, 4);
	}
}