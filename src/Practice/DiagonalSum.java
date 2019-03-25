package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

class TreeNode{
	int vd;
	int val;
	
	TreeNode left, right;
	
	TreeNode(int val){
		this.val = val;
		vd = Integer.MAX_VALUE;
	}
}
public class DiagonalSum {
	public static void main(String s[]) {
		
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		
		TreeNode node3 = new TreeNode(9);
		
		TreeNode node4 = new TreeNode(6);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(5);
		
		TreeNode node7 = new TreeNode(10);
		TreeNode node8 = new TreeNode(11);
		TreeNode node9 = new TreeNode(12);
		
		TreeNode node10 = new TreeNode(7);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		
		node2.left = node5;
		node2.right = node6;
		
		
		node3.right = node7;
		node4.left = node8;
		
		node5.left = node9;
		node5.right = node10;
		
		
		
		DiagonalSum diaSum = new DiagonalSum();
		diaSum.findDiagonal(root);
		
	}
	
	public void findDiagonal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, Integer> map = new HashMap<>();
		root.vd =0;
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			TreeNode curr = queue.remove();
			int vd = curr.vd;
			while(curr != null) {
				int prevSum =  (map.get(vd) == null)? 0: map.get(vd);
				map.put(vd, prevSum+curr.val);
				
				if(curr.left != null) {
					curr.left.vd = vd +1;
					queue.add(curr.left);
				}	
				curr = curr.right;
			}	
		}
		for(Entry<Integer, Integer> values: map.entrySet()) {
			System.out.println("Key: "+ values.getKey()+ " Values: "+ values.getValue());
		}
	}
}
