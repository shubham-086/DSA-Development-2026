import java.util.Arrays;

public class BasicSorting {
	static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int small = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[small]) {
					small = j;
				}
			}
			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;
		}
	}

	static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	static void insertion(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 80, 45, 32, 60, 10, 25, 75, 58, 18 };
		// selectionSort(arr);
		// bubbleSort(arr);
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}
}
