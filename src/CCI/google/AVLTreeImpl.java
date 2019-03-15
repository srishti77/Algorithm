package CCI.google;

class AVLTree {
	int key, height;
	AVLTree right, left;

	AVLTree(int key) {
		this.key = key;
		height = 1;
	}
}

public class AVLTreeImpl {

	AVLTree root;

	public static void main(String s[]) {

		AVLTreeImpl tree = new AVLTreeImpl();

		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 25);

		tree.preorder(tree.root);
		tree.deleteNode(tree.root, 50);
		System.out.println();
		tree.preorder(tree.root);
		
		tree.root = tree.deleteNode(tree.root, 30);
		System.out.println();
		tree.preorder(tree.root);
	}

	int height(AVLTree node) {
		if (node == null)
			return 0;

		return node.height;
	}

	AVLTree rightRotate(AVLTree n) {

		AVLTree x = n.left;

		AVLTree t2 = x.right;

		x.right = n;
		n.left = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		n.height = Math.max(height(n.left), height(n.right)) + 1;

		return x;
	}

	AVLTree leftRotate(AVLTree n) {

		AVLTree x = n.right;

		AVLTree t2 = x.left;

		x.left = n;
		n.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		n.height = Math.max(height(n.left), height(n.right)) + 1;

		return x;
	}

	int getBalance(AVLTree n) {
		if (n == null)
			return 0;

		return height(n.left) - height(n.right);
	}

	AVLTree insert(AVLTree n, int key) {

		if (n == null) {
			// System.out.println("Current node: "+key);
			return new AVLTree(key);

		}

		if (key < n.key)
			n.left = insert(n.left, key);

		else if (key > n.key)
			n.right = insert(n.right, key);
		else
			return n;

		n.height = 1 + Math.max(height(n.left), height(n.right));

		int balance = getBalance(n);

		if (balance > 1 && key < n.left.key)
			return rightRotate(n);

		if (balance < -1 && key > n.right.key)
			return leftRotate(n);

		if (balance > 1 && key > n.left.key) {
			n.left = leftRotate(n.left);
			return rightRotate(n);
		}

		if (balance < -1 && key < n.right.key) {
			n.right = rightRotate(n.right);
			return leftRotate(n);
		}
		return n;
	}

	AVLTree deleteNode(AVLTree node, int key) {

		if (node == null)
			return node;

		if (key < node.key)
			node.left = deleteNode(node.left, key);

		else if (key > node.key)
			node.right = deleteNode(node.right, key);
		else {
			if (node.left == null || node.right == null) {

				AVLTree temp = null;
				if (temp == node.left) {
					temp = node.right;
				} else {
					temp = node.left;
				}

				if (temp == null) {
					temp = node;
					node = null;
				}

				else {
					root = temp;
				
				}
			} else {
				AVLTree temp = minValueNode(node.right);
				node.key = temp.key;

				node.right = deleteNode(node.right, temp.key);
			}
		}

		if (node == null)
			return node;

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	private AVLTree minValueNode(AVLTree right) {
		// TODO Auto-generated method stub
		
		AVLTree node = right;
		
		while(node.left != null) {
			node = node.left;
			
		}
		return node;
	}

	void preorder(AVLTree n) {

		if (n != null) {
			System.out.print(n.key + " ");
			preorder(n.left);
			preorder(n.right);
		}
	}
}
