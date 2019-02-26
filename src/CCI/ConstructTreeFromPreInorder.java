package CCI;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPreInorder {
	
	int preorder = 0;
	public static void main(String s[]) {
		ConstructTreeFromPreInorder construct = new ConstructTreeFromPreInorder();
		construct.buildTree();
	}
	public void buildTree() {
		int preOrder[] = {3,9,20,15,7};
		int inOrder[] = {9,3,15,20,7};
		
		if(preOrder == null || preOrder.length ==0)
			return;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<inOrder.length; i++) {
			map.put(inOrder[i], i);
		}
		
		BinaryTree root = btHelper(preOrder, map, 0, inOrder.length-1);		
		print(root);
	}
	
	private BinaryTree btHelper(int[] preOrder, Map<Integer, Integer> map, int start, int end) {
		// TODO Auto-generated method stub
		if(start > end) return null;
		
		BinaryTree binaryTree = new BinaryTree(preOrder[preorder++]);
		
		int index = map.get(binaryTree.value);
		
		binaryTree.left = btHelper(preOrder, map, start, index-1);
		binaryTree.right = btHelper(preOrder, map, index+1, end);
		
		return binaryTree;
	}	
	
	public void  print(BinaryTree root) {
		if(root != null) {
			print(root.left);
			System.out.println(root.value);
			print(root.right);
		}
	}
}

class BinaryTree{
	int value;
	BinaryTree left;
	BinaryTree right;
	
	BinaryTree(int value) {
		this.value = value;
	}
}