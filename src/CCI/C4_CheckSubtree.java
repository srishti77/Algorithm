package CCI;

import CCI.Bc4_STSequences.BSTree;

public class C4_CheckSubtree {
	
	public static void main(String s[]) {
		Bc4_STSequences tree1 = new Bc4_STSequences();
		tree1.insert(5);
		tree1.insert(3);
		tree1.insert(2);
		tree1.insert(4);
		tree1.insert(8);
		tree1.insert(7);
		tree1.insert(9);
		tree1.insert(12);
		tree1.insert(10);
		tree1.insert(13);
		
		Bc4_STSequences tree2 = new Bc4_STSequences();
		tree2.insert(12);
		tree2.insert(11);
		tree2.insert(13);
		C4_CheckSubtree subtree = new C4_CheckSubtree();
		System.out.println(subtree.checkDescend(tree1.root, tree2.root));
	}

	
	public boolean checkDescend(BSTree node1, BSTree node2) {
		
		if(node1 == null)
			return false;
		
		if(node1!=null && node1.data==node2.data) {
			System.out.println("Compare Trees: "+compareTrees(node1, node2));
			return true;
		}
		return checkDescend(node1.left, node2) || checkDescend(node1.right, node2) ;
	}


	private boolean compareTrees(BSTree node1, BSTree node2) {
		// TODO Auto-generated method stub
		if(node1 == null && node2==null)
			return true;
		else if(node1.data != node2.data)
			return false;
		System.out.println("Node1 "+node1.data +" Node2 "+ node2.data);
			return compareTrees(node1.left, node2.left) && compareTrees(node1.right, node2.right);
		
	}

}
