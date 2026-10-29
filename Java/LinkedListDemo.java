public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.addFirst(5);
		list.addFirst(2);

		list.add(15, 3);

		// list.removeLast();

		list.remove(5);

		list.print();
		System.out.println(list.size());
	}
}

class LinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	void addLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = newNode;
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void add(int data, int pos) {
		Node newNode = new Node(data);

		if (pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node curr = head;
		for (int i = 1; i < pos - 1; i++) {
			curr = curr.next;
		}

		if (curr == null) {
			System.out.println("Position out of range");
			return;
		}

		newNode.next = curr.next;
		curr.next = newNode;
	}

	void removeLast() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}

		curr.next = null;
	}

	void remove(int pos) {
		if (pos < 1) {
			System.out.println("Invalid postion");
			return;
		}

		if (pos == 1) {
			head = head.next;
			return;
		}

		Node curr = head;
		for (int i = 1; i < pos - 1; i++) {
			curr = curr.next;
		}

		if (curr == null || curr.next == null) {
			System.out.println("Position out of range");
			return;
		}

		curr.next = curr.next.next;
	}

	int size() {
		if (head == null) {
			return 0;
		}

		int size = 0;
		Node curr = head;
		while (curr != null) {
			size++;
			curr = curr.next;
		}

		return size;
	}

	void print() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.print("null");
	}
}
