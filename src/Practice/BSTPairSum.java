package Practice;

public class BSTPairSum {
	BinaryTree node;
	public static void main(String s[]) {
		
		BinaryTree root = new BinaryTree(2);
		BinaryTree node1 = new BinaryTree(1);
		
		BinaryTree node2 = new BinaryTree(3);
		/*BinaryTree node3 = new BinaryTree(2);
		
		BinaryTree node4 = new BinaryTree(4);
	
		BinaryTree node6 = new BinaryTree(7);
		*/
		root.left = node1;
		root.right = node2;
		
	/*	node1.left = node3;	
	/*	node1.right = node4;
		
		
		node2.right = node6;
		
	
		*/
		BSTPairSum sum = new BSTPairSum();
		System.out.println(sum.findTarget(root, 4));
		
	}
	
	 public boolean findTarget(BinaryTree root, int k) {
	      
		 if(root == null) {
			 return false;
		 }
		 
		 return isElementFound(root, k-root.val)|| findTarget(root.left, k) || findTarget(root.right, k);
	 }
	 
	 public boolean isElementFound(BinaryTree root , int k) {
		 if(root == null)
			 return false;
		 if(k == root.val) {
			 return true;
		 }
		 
		 else if(k < root.val)
			 return isElementFound(root.left, k);
		 else
			 return isElementFound(root.right, k);
		 
	 }
	 
}
