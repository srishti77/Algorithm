package CCI;

import java.util.ArrayList;
import java.util.Stack;


public class FindPathBinaryTree {
	
	BST root;
	int count =0;
	Stack<Integer> stack = new Stack<>();
	
	Queue<BST> queue = new Queue<BST>();
	public static void main(String s[]) {
		
		FindPathBinaryTree tree = new FindPathBinaryTree();
		  tree.root = new BST(10); 
	      tree.root.left = new BST(5); 
	      tree.root.right = new BST(12); 
	      tree.root.left.left = new BST(67); 
	      tree.root.left.right = new BST(7); 
	        
	      tree.root.left.right.left = new BST(8); 
	      tree.root.left.right.right = new BST(9); 
	        
	      tree.root.right.left = new BST(11); 
	      tree.root.right.right = new BST(15); 
	      tree.queue.insert(tree.root);
	      
	      tree.findPath(tree.root, 15); 
	      
	      tree.print();
	     // tree.printElementLevelWise();
	      System.out.println();
	      System.out.println(Math.floor(Math.sqrt(tree.count)) +1);
	      
	      System.out.println("Max avg"+tree.findAvg());
	      
	}
	
	public void print() {
		
	      int count =0;
		while(!stack.isEmpty()) {
			count++;
			System.out.println(stack.pop());
		}
		System.out.println(count);
	}
	
	
	public void printElementLevelWise() {
		int avg = root.value;
		
		while(!queue.isEmpty()) {
			
			BST node = queue.delete();
			if(node != null) {
			System.out.println(node.value);
			
			if(!node.isVisited) {
			
				queue.insert(node.left);
				queue.insert(node.right);
				node.isVisited= true;
				}
			}
			
		}
		
	}
	
	
	public float findAvg() {
		
		ArrayList<BST> list = new ArrayList<BST>();
		list.add(root);
		float maxAvg = root.value;
		ArrayList<BST> tempList = new ArrayList<BST>();
		while( !list.isEmpty()) {
			
			int sum =0, i;
			for( i=0; i< list.size(); i++) {
				if(list.get(i).left != null ) {
					tempList.add(list.get(i).left);
					sum = sum + list.get(i).left.value;
				}
			 if(list.get(i).right != null) {
					tempList.add(list.get(i).right);
					sum = sum + list.get(i).right.value;
				}
				System.out.println("for loop");
			}
			System.out.println(sum);
			maxAvg = Math.max(maxAvg, sum/(list.size()));
			System.out.println(maxAvg);
			
			list.clear();
			list.addAll(tempList);
		
			tempList.clear();
			
		}
		return maxAvg;
	}
	
	public boolean findPath(BST root, int value ){
		
		if(root == null) {				
			return false;
		}
		
		stack.push(root.value);
		
		if(root.value == value)
			return true;
		
		if(findPath(root.left, value) || findPath(root.right, value)) {
			return true;
		}
		else
		{
			stack.pop();
			return false;
		}	
		
	}
}
