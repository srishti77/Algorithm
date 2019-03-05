package CCI.google;

public class ValidateBST {
	boolean answer= true;
	public static void main(String s []) {
		
		ValidateBST bst = new ValidateBST();
		TreeNode1 node1 = new TreeNode1(5);
		TreeNode1 node2 = new TreeNode1(1);
		
		TreeNode1 node3 = new TreeNode1(10);
		TreeNode1 node4 = new TreeNode1(4);
		TreeNode1 node5 = new TreeNode1(12);
		
		node1.left = node2;
		node1.right = node3;
		
		node3.left = node4;
		node3.right = node5;
		
		System.out.println(bst.isValidBST(node1, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
	}
	
	public boolean isValidBST(TreeNode1 root, int left, int right) {
       
        if(root == null) return true;
        
        if(root.val >right || root.val < left) return false;
        
        if(root.val  == Integer.MIN_VALUE && root.left != null) return false;
        
        if(root.val  == Integer.MAX_VALUE && root.right != null) return false;
        
        return isValidBST(root.left, left, root.val-1) && isValidBST(root.right, root.val+1, right);
        
    }
	
	
}
