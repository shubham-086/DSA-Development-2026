import java.util.Arrays;

public class ArrayPractice {

	// public static int maxSubArray(int[] nums) {
	// int max = Integer.MIN_VALUE;
	// for (int i = 0; i < nums.length; i++) {
	// int sum = 0;
	// for (int j = i; j < nums.length; j++) {
	// sum += nums[j];
	// max = Math.max(max, sum);
	// }
	// }
	// return max;
	// }

	public static int maxSubArray(int[] nums) {
		int curr = 0;
		int max = nums[0];

		for (int i = 0; i < nums.length; i++) {
			curr = Math.max(nums[i], nums[i] + curr);
			max = Math.max(curr, max);
		}

		return max;
	}

	// public static void rotate(int[] nums, int k) {
	// int n = nums.length;
	// k = k % n;

	// for (int i = 0; i < k; i++) {
	// int last = nums[n - 1];

	// for (int j = n - 1; j > 0; j--) {
	// nums[j] = nums[j - 1];
	// }

	// nums[0] = last;
	// }
	// }

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;

		// reverse full array
		reverse(nums, 0, n - 1);

		// reverse from 0 to k
		reverse(nums, 0, k - 1);

		// reverese remainin k+1 to n-1;
		reverse(nums, k, n - 1);
	}

	public static void reverse(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// int arr[] = { 5, 4, -1, 7, 8 };
		// int max = maxSubArray(arr);
		// System.out.println(max);

		int arr[] = { -1, -100, 3, 99 };
		// rotate(arr, 2);
		rotate(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
}