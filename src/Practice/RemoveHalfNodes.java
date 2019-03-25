package Practice;

public class RemoveHalfNodes {
	public static void main(String s[]) {
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		
		BinaryTree node2 = new BinaryTree(3);
		BinaryTree node3 = new BinaryTree(4);
		
		BinaryTree node4 = new BinaryTree(5);
		BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(7);
		
		BinaryTree node7 = new BinaryTree(8);
		BinaryTree node8 = new BinaryTree(9);
		
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;	
		node3.right = node6;
		
		node2.left = node4;
		node2.right = node5;
		
		node4.left = node7;
		node4.right = node8;
		
		RemoveHalfNodes remove = new RemoveHalfNodes();
		
		BinaryTree node =  remove.removehalfNodes(root);
		
		remove.print(node);
	}
	
	public void print(BinaryTree node) {
		
		if(node != null) {
			print(node.left);
			System.out.println(node.val);
			print(node.right);
		}
	}
	
	public BinaryTree removehalfNodes(BinaryTree node) {
		
		if(node == null)
			return null;
		
		if(node.left == null && node.right != null) {
			node =removehalfNodes(node.right);
			//System.out.println(node.val);
			//return node;
		}
		
		if(node.right == null && node.left != null)
		{
			node = removehalfNodes(node.left);
			//return node;
		}
		
		node.left = removehalfNodes(node.left);
		node.right = removehalfNodes(node.right);
			
		return node;
		
	}
}
