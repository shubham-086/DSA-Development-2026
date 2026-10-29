public class DoublyLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.add(25, 4);

		list.reverse();

		list.print();
	}
}

class LinkedList {
	class Node {
		int data;
		Node prev, next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	void add(int data) {
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
		newNode.prev = curr;
	}

	void add(int data, int index) {
		Node newNode = new Node(data);

		if (index == 0) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
			}
			head = newNode;
			return;
		}

		Node curr = head;
		int count = 0;
		while (count < index - 1 && curr != null) {
			curr = curr.next;
			count++;
		}

		if (curr == null) {
			System.out.println("Invalid Index");
			return;
		}

		newNode.next = curr.next;
		newNode.prev = curr;
		if (curr.next != null) {
			curr.next.prev = newNode;
		}
		curr.next = newNode;
	}

	void reverse() {
		Node curr = head;
		Node temp = null;

		while (curr != null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;

			curr = curr.prev;
		}

		if (head != null) {
			head = temp.prev;
		}
	}

	void print() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}
}