import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		pq.add(20);
		pq.add(72);
		pq.add(12);
		pq.add(39);
		pq.add(92);
		pq.add(48);

		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(38);
		arr.add(15);
		arr.add(18);
		arr.add(21);
		arr.add(52);

		Collections.sort(arr);
		System.out.println(arr);

	}
}

class MinHeap {
	int[] heap;
	int size;

	MinHeap(int capacity) {
		this.size = 0;
		heap = new int[capacity];
	}

	int parent(int i) {
		return (i - 1) / 2;
	}

	int leftChild(int i) {
		return 2 * i + 1;
	}

	int rightChild(int i) {
		return 2 * i + 2;
	}

	void add(int value) {
		if (size == heap.length) {
			throw new RuntimeException("Heap is full");
		}
		heap[size] = value;
		int current = size;
		size++;

		while (current > 0 && heap[current] < heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	int remove() {
		if (size == 0) {
			throw new RuntimeException("Heap is empty");
		}
		int x = heap[0];
		heap[0] = heap[size - 1];
		size--;

		heapifyDown();

		return x;
	}

	void heapifyDown() {
		int current = 0;

		while (true) {
			int left = leftChild(current);
			int right = rightChild(current);
			int smallest = current;

			if (heap[left] < heap[smallest]) {
				smallest = left;
			}

			if (heap[right] < heap[smallest]) {
				smallest = right;
			}

			if (smallest == current) {
				break;
			}

			swap(current, smallest);

			current = smallest;
		}
	}

	void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
}
