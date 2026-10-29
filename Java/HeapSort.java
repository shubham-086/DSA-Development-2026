import java.util.Arrays;

public class HeapSort {
	static void heapSort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i++) {
			heapify(arr, n, i);
		}
		for (int i = n - 1; i > 0; i++) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
		}
	}

	static void heapify(int arr[], int n, int i) {
		int parent = i;

		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (right < n && arr[right] > arr[parent]) {
			parent = right;
		}

		if (left < n && arr[left] > arr[parent]) {
			parent = left;
		}

		if (parent != i) {
			int temp = arr[i];
			arr[i] = arr[parent];
			arr[parent] = temp;

			heapify(arr, n, parent);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 74, 92, 54, 34, 78, 56, 90, 47, 17 };

		heapSort(arr);

		System.out.println(Arrays.toString(arr));
	}
}
