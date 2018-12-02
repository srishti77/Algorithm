package CCI;

import java.util.Random;

public class C4_RandomNodes {
	
	static RandomTree root= null;
	int size;
	
	public static void main(String arg[]) {	
		 
		C4_RandomNodes node = new C4_RandomNodes();
		node.insert(10);
		node.insert(5);
		node.insert(3);
		node.insert(6);
		node.insert(15);
		node.insert(12);
		node.insert(17);
		node.insert(18);
		node.insert(16);
		
		System.out.println(node.getRandomNode(root));
	}
	
	class RandomTree{
		int data;
		RandomTree left;
		RandomTree right;
		int size;
		RandomTree(int data){
			this.data = data;
		}
		public RandomTree getRandomNode(RandomTree left2) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	public void insert(int data) {
		insert(root, data);
	}
	
	public RandomTree insert(RandomTree node, int data) {
		
		if(root == null) {
			node = new RandomTree(data);
			root = node;
			size=1;	
			node.size =1;
		}
		
		else if(node == null) {
			node = new RandomTree(data);
			node.size = size+1;
		}
		else if(data > node.data) {
			node.right = insert(node.right, data);		
		}
			
		else if(data < node.data) {
			node.left = insert(node.left, data);	
		}
		size++;
		return node;		
	}
	
	public void print() {
		print(root);
	}
	
	public void print(RandomTree root) {
		if(root != null) {
			System.out.println(root.data);
			print(root.left);
			print(root.right);		
		}
		
	}
		
	int size() {
		return size;
	}
	public RandomTree getRandomNode(RandomTree randomTree) {
		
		int leftSize= randomTree.left==null ?  0:  randomTree.left.size;
		
		Random random = new Random();
		int index = random.nextInt(size);
		System.out.println("hello"+ index);
		if(index < leftSize)
			return randomTree.left.getRandomNode(randomTree.left);
		else if(index==leftSize) {
			return randomTree;
		}
		else {
			return randomTree.left.getRandomNode(randomTree.right);
		}
		
	}
	
}
