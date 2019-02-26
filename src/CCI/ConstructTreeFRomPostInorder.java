package CCI;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFRomPostInorder {
	int postOrder = 4;
	
	public static void main(String s[]) {
		ConstructTreeFRomPostInorder construct = new ConstructTreeFRomPostInorder();
		int inorder[] = {9,3,15,20,7};
		int postorder[] = {9,15,7,20,3};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<inorder.length; i++) {
			map.put(inorder[i], i);
		}
		System.out.println("fgggg");
		BinaryTree root = construct.constructFromPostInorder(postorder, map,0, inorder.length-1);
		System.out.println("root:"+ root.value);
		construct.print(root);
		
	}
	
	public BinaryTree constructFromPostInorder(int[] postorder, Map<Integer, Integer> map, int start, int end) {
		
		if(start > end || postOrder <0)
			return null;
		
		//System.out.println("Here"+ index);
		
		BinaryTree tree = new BinaryTree(postorder[postOrder--]);
		int currIndex = map.get(tree.value);
		System.out.println("Value: "+tree.value +" "+ start+ " "+ (currIndex-1));
		
		
		tree.right = constructFromPostInorder(postorder, map, currIndex+1, end);
		tree.left = constructFromPostInorder(postorder, map, start, currIndex-1);
		
		return tree;
		
	}
	
	public void  print(BinaryTree root) {
		
		if(root != null) {
			print(root.left);
			System.out.println(root.value);
			print(root.right);
		}
	}
}
