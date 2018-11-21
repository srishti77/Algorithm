package CCI;

import CCI.Bc4_STSequences.BSTree;

public class C4_FirstCommonAncestor {
	
	public static void main(String s[]) {
		

		Bc4_STSequences tree = new Bc4_STSequences();
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);
		tree.insert(8);
		tree.insert(10);
		tree.insert(11);
		
		//tree.print();
		//System.out.println(tree.root);
		C4_FirstCommonAncestor cf= new C4_FirstCommonAncestor();
		System.out.println(cf.checkDescend(tree.root, 54));
		
		System.out.println("Find common:::"+ cf.findCommonAnc(tree.root, 3, 10));
		
	}
	
	public BSTree findCommonAnc(BSTree root, int value1, int value2){
		
		if(checkDescend(root.left, value1)) {
			
			if(checkDescend(root.left, value2)) {
				root.left =findCommonAnc(root.left, value1, value2);
			}
			else if(checkDescend(root.right, value2)) {
				System.out.println("Root:"+ root.data);
				return root;
			}
			else {
				System.out.println("Do nothing");
				return null;
			}
		}
		else if(checkDescend(root.right, value1)) {
			if(checkDescend(root.right, value2)) {
				root.right =findCommonAnc(root.right, value1, value2);
			}
			else if(checkDescend(root.left, value2)) {
				System.out.println("Root:"+ root.data);
				return root;
			}
		}
		
		return null;
		
	}
	
	public boolean checkDescend(BSTree node, int value) {
		
		if(node == null)
			return false;
		
		if(node!=null && node.data==value)
			return true;

		return checkDescend(node.left, value) || checkDescend(node.right, value) ;
	}
	
	
}