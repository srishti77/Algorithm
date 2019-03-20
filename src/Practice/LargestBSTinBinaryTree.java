package Practice;

class Wrapper{
	int size, lower, higher;
	boolean isBST;
	
	public Wrapper(){
		lower = Integer.MIN_VALUE;
		higher = Integer.MAX_VALUE;
		size =0;
	}
}
public class LargestBSTinBinaryTree {
	
	public static void main(String s[]) {
		
		LargestBSTinBinaryTree largestBST = new LargestBSTinBinaryTree();
		
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		
		BinaryTree node2 = new BinaryTree(3);
		BinaryTree node3 = new BinaryTree(4);
		
		BinaryTree node4 = new BinaryTree(5);
		BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(7);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;	
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		
		System.out.println(largestBST.helper(root).size);
		
	}
	
	public Wrapper helper(BinaryTree root) {
		
		Wrapper wrap = new Wrapper();
		if(root == null) {
			return wrap;
		}
		
		Wrapper l = helper(root.left);
		Wrapper r = helper(root.right);
		
		wrap.lower = Math.min(l.lower, root.val);
		wrap.higher = Math.max(r.higher, root.val);
		
		if(l.isBST && r.isBST && l.higher <= root.val && r.lower >= root.val) {
			wrap.size = 1 + l.size + r.size;
			wrap.isBST = true;
		}
		else {
			wrap.size = Math.max(l.size, r.size);
			wrap.isBST = false;
		}
		
		return wrap;
	}
}
