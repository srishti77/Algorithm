package CCI;

public class C4_4CheckBalancedTree {
	
	public static void main(String s[]) {
		

		BinaryTree1 root = new BinaryTree1(8);
		BinaryTree1 node1 = new BinaryTree1(4);
		
		BinaryTree1 node2 = new BinaryTree1(10);
		BinaryTree1 node3 = new BinaryTree1(2);
		
		BinaryTree1 node4 = new BinaryTree1(6);
		BinaryTree1 node5 = new BinaryTree1(15);
		
		BinaryTree1 node7 = new BinaryTree1(6);
		BinaryTree1 node6 = new BinaryTree1(15);
		
		root.left = node1;
		root.right = node2;
		
		
		node2.left = node3;
		//node3.left = node4;
		
		node2.right = node5;
		
		C4_4CheckBalancedTree tree = new C4_4CheckBalancedTree();
		System.out.println(tree.isBalancedTree(root));
		
	}
	
	public boolean isBalancedTree(BinaryTree1 root) {
		return Math.abs(heightOfATree(root.left,-1)- heightOfATree(root.right, -1)) <= 1;
	}
	
	public int heightOfATree(BinaryTree1 root, int height) {
		
		if(root == null ) {
			System.out.println("Height: "+height);
			return height;
		}
		
		return (Math.max(heightOfATree(root.left, height+1), heightOfATree(root.right, height+1)));
		
	}
}
