package mockinterview;
class Tree_Node{
	
	int val;
	  Tree_Node left;
	   Tree_Node right;
	  Tree_Node(int x) { val = x; }
}

public class TrimBST {
	Tree_Node head ;
	public static void main(String s[]) {
		TrimBST bst = new TrimBST();
		Tree_Node tree1 = new Tree_Node(3);
		Tree_Node tree2 = new Tree_Node(0);
		Tree_Node tree3 = new Tree_Node(4);
		
		Tree_Node tree4 = new Tree_Node(2);
		Tree_Node tree5 = new Tree_Node(1);
		
		tree1.left = tree2;
		tree1.right = tree3;
		
		tree2.right = tree4;
		tree4.left = tree5;
		
		Tree_Node head = bst.trimBST(tree1, 2, 4);
		bst.print(head);
	}
	
	public void print(Tree_Node node) {
		if(node != null) {
			print(node.left);
			System.out.println(node.val);
			print(node.right);
		}
	}
	  public Tree_Node trimBST(Tree_Node root, int L, int R) {
	        if(root == null)
	        	return root;
	        
	        if(root.val <= R && root.val >=L) {
	        	root.left = trimBST(root.left, L, R);
	        	root.right = trimBST(root.right, L , R);
	        }
	        else if(root.val > R) {
	        	root = root.left;
	        	trimBST(root, L, R);
	        }
	        else if(root.val < L) {
	        	root = root.right;
	        	trimBST(root, L, R);
	        }
	        
	        return root;
	  }
}
