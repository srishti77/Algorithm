package CCI;

import java.awt.Checkbox;

public class TreeBST {
	BST root;
	public static void main(String s[]) {
		
		TreeBST tree = new TreeBST();
		tree.root = new BST(10); 
	    tree.root.left = new BST(5); 
	    tree.root.right = new BST(12); 
	    tree.root.left.left = new BST(4); 
	    tree.root.left.right = new BST(7); 
	        
	    //tree.root.left.right.left = new BST(8); 
	    tree.root.left.right.right = new BST(9); 
	        
	    tree.root.right.left = new BST(11); 
		System.out.println(tree.checkBSTValidity(tree.root, null, null));
		
	
	}
	
	public boolean checkBSTValidity(BST root, Integer max, Integer min){
		
		if(root == null)
			return true;
	
		if((min != null && root.value <= min) || (max != null &&  root.value >= max ))
			return false;
		
		if(!checkBSTValidity(root.left, root.value, min) || !checkBSTValidity(root.right, max, root.value))
			return false;
		
		else
			return true;	
	}
}
