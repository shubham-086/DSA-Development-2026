public class CircularLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		list.print();
	}
}

class LinkedList {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}

		Node curr = head;
		do {
			curr = curr.next;
		} while (curr.next != head);

		newNode.next = head;
		curr.next = newNode;
	}

	void print() {
		Node curr = head;
		do {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		} while (curr != head);
		System.out.println(head.data);
	}
}