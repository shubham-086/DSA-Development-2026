import java.util.LinkedList;
import java.util.Queue;

public class TreeExample {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Tree t = new Tree();
		Node root = t.buildTree(arr);

		// System.out.println(root.data);
		// t.preOrder(root);
		// t.inOrder(root);
		// t.postOrder(root);
		t.levelOrder(root);
	}
}

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
	}
}

class Tree {
	static int i = -1;

	Node buildTree(int nodes[]) {
		i++;

		if (nodes[i] == -1) {
			return null;
		}

		Node newNode = new Node(nodes[i]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);

		return newNode;
	}

	void preOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	void levelOrder(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			Node curr = q.poll();

			System.out.print(curr.data + " ");

			if (curr.left != null) {
				q.offer(curr.left);
			}
			if (curr.right != null) {
				q.offer(curr.right);
			}
		}
	}
}
