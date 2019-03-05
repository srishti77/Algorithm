package CCI.google;

public class ClosestBST {
	
	public static void main(String s[]) {
		

				
		TreeNode1 node1 = new TreeNode1(1500000000);
		TreeNode1 node2 = new TreeNode1(1400000000);
		TreeNode1 node3 = new TreeNode1(5);
		
		TreeNode1 node4 = new TreeNode1(1);
		
		TreeNode1 node5 = new TreeNode1(3);
		
		node1.left = node2;
		/*node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;*/
		
		ClosestBST close = new ClosestBST();
		
		System.out.println(close.closestValue(node1,-1500000000.0));
		
	}
	
	public int closestValue(TreeNode1 root, double target) {
     
		int closestValue = root.val;
		double closestDiff = Double.MAX_VALUE;
		
		while(root != null) {
			double currDiff = Math.abs(target-root.val) ;
			if(closestDiff > currDiff)
			{
				closestDiff = currDiff;
				closestValue = root.val;
			}
			
			if(root.val > target) {
				root = root.left;
			}
			else if(root.val < target)
				root = root.right;
			else
				break;
		}
		return closestValue;
		
    }
}
