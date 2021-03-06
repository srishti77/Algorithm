package CCI;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AllPossibleBinaryTree {
	
	Map<Integer, List<TreeNode>> memo = new HashMap();
	
	public static void main(String args[]) {
		
		
		AllPossibleBinaryTree all = new AllPossibleBinaryTree();
		System.out.println(all.allPossibleBST(5).size());
	}
	
	public List<TreeNode> allPossibleBST(int N){
		if(!memo.containsKey(N)) {
			List<TreeNode> ans = new LinkedList();
			if(N == 1)
				ans.add(new TreeNode(0));
			
			else if(N%2==1){
				
				for(int x=0; x <N; ++x) {
					int y= N-1-x;
					for(TreeNode left: allPossibleBST(x)) {
						
						for(TreeNode right: allPossibleBST(y)) {
							
							TreeNode bns = new TreeNode(0);
							bns.left = left;
							bns.right = right;
							System.out.println("x: "+ x + " y: "+ y+ " bns "+ bns);
							ans.add(bns);
							
						}
					}
				}			
			}
			
			memo.put(N, ans);	
		}
		return memo.get(N);	
	}
	
	
}
 class TreeNode {
	   int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
	 }