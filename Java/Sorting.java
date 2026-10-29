import java.util.Arrays;

public class Sorting {
	static void merge(int arr[], int start, int mid, int end) {
		int temp[] = new int[end - start + 1];

		int i1 = start;
		int i2 = mid + 1;
		int x = 0;

		while (i1 <= mid && i2 <= end) {
			if (arr[i1] < arr[i2]) {
				temp[x++] = arr[i1++];
			} else {
				temp[x++] = arr[i2++];
			}
		}

		while (i1 <= mid) {
			temp[x++] = arr[i1++];
		}

		while (i2 <= end) {
			temp[x++] = arr[i2++];
		}

		for (int i = 0, j = start; i < temp.length; i++, j++) {
			arr[j] = temp[i];
		}
	}

	static void mergeSort(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = start + (end - start) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);

		merge(arr, start, mid, end);
	}

	static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start - 1;

		for (int j = start; j < end; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;

		return i;
	}

	static void quickSort(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}

		int pi = partition(arr, start, end);

		quickSort(arr, start, pi - 1);
		quickSort(arr, pi + 1, end);
	}

	public static void main(String[] args) {
		int arr[] = { 74, 92, 54, 34, 78, 56, 90, 47, 17 };

		// mergeSort(arr, 0, arr.length - 1);

		quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}
}