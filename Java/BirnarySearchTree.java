public class BirnarySearchTree {
	static class TreeNode {
		int data;
		TreeNode left, right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}

		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}

		return root;
	}

	static TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}

		if (key < root.data) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.data) {
			root.right = deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			}
			if (root.right == null) {
				return root.left;
			}

			TreeNode successor = findMin(root.right);
			root.data = successor.data;
			root.right = deleteNode(root.right, successor.data);
		}

		return root;
	}

	static TreeNode findMin(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}

		return node;
	}

	static void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		TreeNode root = insert(null, 10);
		insert(root, 5);
		insert(root, 2);
		insert(root, 7);
		insert(root, 20);
		insert(root, 15);
		insert(root, 12);
		insert(root, 18);
		insert(root, 25);
		insert(root, 30);
		insert(root, 21);

		inOrder(root);
		deleteNode(root, 15);
		System.out.println();
		inOrder(root);
	}
}
