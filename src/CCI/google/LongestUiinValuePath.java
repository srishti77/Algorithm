package CCI.google;

public class LongestUiinValuePath {
	
	int best =0;
	public static void main(String s[]) {
		
		TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(4);
		
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(1);
		
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(5);
		
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.right = node5;
		
		LongestUiinValuePath valuePath = new LongestUiinValuePath();
		
		
		System.out.println(valuePath.maxLengthUniValue(root));
		
	}
	
	
	public int maxLengthUniValue(TreeNode node) {
		
		if(node == null)
			return 0;
		
		
		int leftp =0, rightp =0;
		leftp = maxLengthUniValue(node.left);
		rightp = maxLengthUniValue(node.right);
		int left =0, right =0;
		if(node.left != null) {
			if(node.left.val == node.val)
				 left = leftp+1;
			
		}
		
		if(node.right != null) {
			if(node.right.val == node.val)
				 right =rightp+1;
		}
		
		best = Math.max(best, left+right);
		return Math.max(left, right);
	
	}
}
