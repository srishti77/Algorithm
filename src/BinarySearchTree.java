class BinaryTree{
	
	int value;
	
	BinaryTree left, right;
	
	BinaryTree(int value){
		this.value = value;
		left= right= null;
	}
}
public class BinarySearchTree{
	BinaryTree root;
	
	BinarySearchTree(){
		root = null;
	}
	
	void insert(int value) {
		root = insertIntoTree(root, value);
	}

	private BinaryTree insertIntoTree(BinaryTree root, int value) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			
			root = new BinaryTree(value);
			return root;
		}
		
		if(value < root.value) {
			root.left = insertIntoTree(root.left, value);
		}
		else if (value> root.value) {
			root.right = insertIntoTree(root.right, value);
		}
		return root;
	}
	
	void display() {
		displayInOrder(root);
	}
	void displayInOrder(BinaryTree root) {
		if(root != null) {
			displayInOrder(root.left);
			System.out.println(root.value);
			displayInOrder(root.right);
		}
		
	
	}
	
	void delete(int key) {
		
		root = deleteFromTheTree(root, key);
		
	}
	
	BinaryTree deleteFromTheTree(BinaryTree root, int value) {
		
		if(root == null) {			
			return root;
		}
		
		if(value < root.value) {
			
			root.left = deleteFromTheTree(root.left, value);
		}
		
		else if(value > root.value) {
			root.right = deleteFromTheTree(root.right, value);
		}
		
		else {
			
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			root.value = findMin(root.right);
			
			root.right = deleteFromTheTree(root.right, root.value);
			
			
			
		}
		return root;
	}
	
	public int findMin(BinaryTree root) {
		
		int minValue = root.value;
		while(root.left != null) {
			minValue = root.left.value;
			root = root.left;
		}
		
		return minValue;
		
	}
	
	public static void main(String args[]) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(29);
		binarySearchTree.insert(19);
		binarySearchTree.insert(40);
		binarySearchTree.insert(15);
		binarySearchTree.insert(20);
		
		binarySearchTree.delete(29);
		binarySearchTree.display();
		
	}
}