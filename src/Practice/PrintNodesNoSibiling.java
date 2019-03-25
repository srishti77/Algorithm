package Practice;

public class PrintNodesNoSibiling {
	
	public static void main(String s[]) {
		
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		BinaryTree node2 = new BinaryTree(3);
		
		BinaryTree node3 = new BinaryTree(4);
		BinaryTree node4 = new BinaryTree(5);
		
		BinaryTree node5 = new BinaryTree(6);
		
		root.left = node1;
		root.right = node2;
		
		node1.right = node3;
		node2.left = node4;
		
		node4.left = node5;
		
		PrintNodesNoSibiling nodeNo = new PrintNodesNoSibiling();
		nodeNo.print(root);
		
	}
	
	public void print(BinaryTree tree) {
		
		if(tree ==null)
			return;
		
		if(tree.left!= null && tree.right == null) {
			System.out.println(tree.left.val);
		}
		else if(tree.left== null && tree.right != null){
			System.out.println(tree.right.val);
		}
		
		print(tree.left);
		print(tree.right);
	}
}
