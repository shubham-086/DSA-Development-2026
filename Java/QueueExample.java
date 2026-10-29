import java.util.Scanner;

public class QueueExample {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter Queue capacity: ");
		// int capacity = sc.nextInt();

		MyQueue queue = new MyQueue(5);

		queue.enqueue(12);
		queue.enqueue(25);
		queue.enqueue(10);
		queue.enqueue(50);
		queue.enqueue(30);

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.enqueue(90);

		queue.print();
	}
}

class MyQueue {
	int[] arr;
	int front;
	int rear;
	int size;
	int capacity;

	MyQueue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}

	void enqueue(int value) {
		if (size == capacity) {
			System.out.println("Queue is full");
			return;
		}
		arr[rear] = value;
		// rear++;
		rear = (rear + 1) % capacity;
		size++;
	}

	int dequeue() {
		if (size == 0) {
			System.out.println("Queue is Empty");
			return -1;
		}

		int val = arr[front];
		front = (front + 1) % capacity;
		size--;

		return val;
	}

	int peek() {
		if (size == 0) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	void print() {
		int index = front;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[index] + " ");
			index = (index + 1) % capacity;
		}
	}
}

// enqueue
// dequeue
// peek
// isEmpty