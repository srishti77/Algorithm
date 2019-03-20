package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

import CCI.BinaryHeap;

class BinaryTree{
	int val;
	BinaryTree left;
	BinaryTree right;
	
	BinaryTree(int val){
		this.val = val;
	}
}

public class TopViewOfTree {
	public static void main(String s[]) {
		
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		
		BinaryTree node2 = new BinaryTree(3);
		BinaryTree node3 = new BinaryTree(4);
		
		BinaryTree node4 = new BinaryTree(5);
		BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(7);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;	
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		TopViewOfTree topV = new TopViewOfTree();
		//topV.topViewLeft(root.left);
		//System.out.println(root.val);
		//topV.topViewRight(root.right);
		
		topV.topViewOfTheTree(root);
	}
	class QueueObj{
		
		int hd;
		BinaryTree node;
		
		QueueObj(int hd, BinaryTree node){
			this.hd = hd;
			this.node = node;
		}
	}
	public void topViewOfTheTree(BinaryTree root) {
		
		Queue<QueueObj> queue = new LinkedList<QueueObj>();
		Map<Integer, BinaryTree> map= new HashMap<Integer, BinaryTree>(); 
		
		   if (root == null) { 
	            return; 
	        } else { 
	            queue.add(new QueueObj( 0, root)); 
	        }
		   
		while(!queue.isEmpty()) {
			
			QueueObj obj = queue.poll();
			if(!map.containsKey(obj.hd)) {
				map.put(obj.hd, obj.node);
			}
			if(obj.node.left != null) {
				queue.add(new QueueObj(obj.hd-1, obj.node.left));
			}
			if(obj.node.right != null)
				queue.add(new QueueObj(obj.hd+1, obj.node.right));
		}
		
		for(Entry<Integer, BinaryTree> entry: map.entrySet()) {
			System.out.println(entry.getValue().val);
		}
		
	}
	
	public void topViewLeft(BinaryTree root) {
		if(root != null) {
			topViewLeft(root.left);
			System.out.println(root.val);
		}
	}
	
	public void topViewRight(BinaryTree root) {
		if(root != null) {
			System.out.println(root.val);
			topViewRight(root.right);
	
		}
	}
}
