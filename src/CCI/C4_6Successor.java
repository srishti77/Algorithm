package CCI;

public class C4_6Successor {
	
	public static void main(String s[]) {
		
		BinaryTree1 root = new BinaryTree1(8);
		BinaryTree1 node1 = new BinaryTree1(4);
		
		BinaryTree1 node2 = new BinaryTree1(10);
		BinaryTree1 node3 = new BinaryTree1(2);
		
		BinaryTree1 node4 = new BinaryTree1(6);
		BinaryTree1 node5 = new BinaryTree1(15);
		
		BinaryTree1 node6 = new BinaryTree1(20);
		
		root.left = node1;
		root.right = node2;
		
		node1.parent = root;
		node1.left = node3;
		node3.parent = node1;
		node1.right = node4;
		node4.parent = node1;

		
		node2.parent = root;	
		node2.left = node5;
		node5.parent = node2; 
		node2.right = node6;
		node6.parent = node2; 
		
		
		C4_6Successor successor = new C4_6Successor();
		//ßSystem.out.println(successor.findLeftMostNodeOfRightChild(root.right.right).data);
		System.out.println(successor.findSuccesor(root.right).data);
		
		
	}

	private BinaryTree1 findSuccesor(BinaryTree1 root) {
		
		if(root == null)
			return null;
		
		if(root.right != null) {
			return findLeftMostNodeOfRightChild(root.right);
		}	
		else {
			BinaryTree1 q = root;
			BinaryTree1 x = q.parent;
			
			while(x!= null && x.left !=q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
		
	}
	private BinaryTree1 findLeftMostNodeOfRightChild(BinaryTree1 root) {
		// TODO 10Auto-generated method stub
		if(root.left == null)
			return root;
		if(root != null && root.left != null ) {
			
			BinaryTree1 tree = findLeftMostNodeOfRightChild(root.left);
			return tree;
			
		}
		
		return null;
		
	}
}

class BinaryTree1{
	
	BinaryTree1 left;
	BinaryTree1 right;
	BinaryTree1 parent;
	int data;
	
	BinaryTree1(int data){
		this.data = data;
	}
	
}