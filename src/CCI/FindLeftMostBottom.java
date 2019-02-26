package CCI;

public class FindLeftMostBottom {
	
	int left =0, depth=0;
	public static void main(String s[]) {
		
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(1);
		
		node1.left = node2;
		node1.right= node4;
		node2.right =node3;
		node4.right = node5;
		
		FindLeftMostBottom bottom = new FindLeftMostBottom();
		bottom.findBottom(node1, 0);
		System.out.println("Left: "+ bottom.left);
		
	}
	
	public void findBottom(TreeNode root, int currentDepth) {
		if(root == null)
			return;
		if(currentDepth > depth) {
			left = root.val;
			depth = currentDepth; 
		}
	
		findBottom(root.left, currentDepth+1);
		findBottom(root.right, currentDepth+1);
	
	}
}
