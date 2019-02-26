package CCI;

public class HouseRobberII {
	
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
		HouseRobberII houseRob = new HouseRobberII();
		
		
		System.out.println(houseRob.rob(node1));
		
	}
	
	public int rob(TreeNode node) {
		if(node == null)
			return 0;
		return Math.max(robExclude(node), robInclude(node));
		
	}
	
	public int robExclude(TreeNode node) {
		if(node == null)
			return 0;
		
		return rob(node.left) +rob(node.right);
	}
	
	public int robInclude(TreeNode node) {
		if(node == null)
			return 0;
		
		return robExclude(node.left) +robExclude(node.right)+ node.val;
	}
	
	
	
	
	
}
