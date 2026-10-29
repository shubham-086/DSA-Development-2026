public class ArrayExample {
	static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int binarySearch(int arr[], int key) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 10, 12, 18, 23, 28, 35, 46, 60 };

		// System.out.println(linearSearch(arr, 28));
		System.out.println(binarySearch(arr, 28));

	}
}
