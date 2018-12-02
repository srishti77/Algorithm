package CCI;

public class Bc4_STSequences {
	BSTree root=null;
	int ways=0;
	public static void main(String s[]) {
		int array[] = {1,2,3,4,5,6,7};
		
		Bc4_STSequences tree = new Bc4_STSequences();
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(4);
		tree.insert(9);
		tree.insert(7);
		tree.insert(8);
		tree.print();
		
		System.out.println("Ways--------------");
		System.out.println("Ways"+ tree.printWays(tree.root));
	}
	
	class BSTree{
		int data;
		BSTree left;
		BSTree right;
		
		BSTree(int data){
			this.data=data;
		}
		
	}
	
	public void insert(int data) {
		root= insert(root, data);
	}
	
	public BSTree insert(BSTree root, int data) {
		
		if(root== null) {
			root = new BSTree(data);
			return root;
		}
		
		if(data < root.data)
			root.left = insert(root.left, data);
		else if(data > root.data)
			root.right = insert(root.right, data);
		
		return root;
	}
	
	public void print() {
		BSTree node = root;
		print(node);
	}
	
	public void print(BSTree root) {
		if(root != null) {
			System.out.println(root.data);
			print(root.left);
			print(root.right);
			
		}
		
	}
	
	public BSTree getNode(BSTree root, int value) {
		
//		if(root == null)
//			return null;
//		System.out.println("current: "+root.data);
		if(root != null && root.data== value) {
			System.out.println(root.data);
			return root;
			}	
		else if(root!=null){
			root.left= getNode(root.left, value);
			root.right= getNode(root.right,value);
			}
		
		return root;
		
	}
	
	public int printWays(BSTree node) {
		
		if(node==null) return 0;
		if(node!= null && (node.left== null && node.right== null))
			return 1;
		System.out.println(node.data);	
		//ways+=printWays(node.left) ;
		//ways+=printWays(node.right);	
			ways+=printWays(node.left) ;
			node= node.left;
			ways+=printWays(node.right);
			node = node.right;
		
		
		return ways;
	}
}
