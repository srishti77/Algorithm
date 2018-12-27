package CCI;

public class CommonAncestor {
	boolean v1= false, v2= false;
	BST root;
	public BST findAncestor(BST node, int value1, int value2) {
		//if one of the value is in left and other one in the right then the current node is the ancestor
		//if both are in left or right, then one opf the child is the ancestor.
		
		//base
		if(node == null)
			return null;
		
		BST temp = null;
		
		if(node.value == value1) {
			v1 = true;
			temp = node;
		}
		
		if(node.value == value2) {
			v2= true;
			temp = node;
		}

		
		BST left_cell= findAncestor(node.left, value1, value2);
		BST right_cell= findAncestor(node.right, value1, value2);
		
		System.out.println("Here:" +node.value+ " value1 "+ value1 +" value2 "+ value2);
	
		if(temp != null) {
			System.out.println(temp.value);
			return temp;
			
		}
			
		if(left_cell != null && right_cell != null) {
			System.out.println("left_cell"+left_cell.value);
			System.out.println("right_cell"+right_cell.value);
			return node;
		}
		
		return (left_cell!=null) ? left_cell: right_cell;
	
	}
	
	
	public static void main (String s[]) {
		CommonAncestor tree = new CommonAncestor(); 
        tree.root = new BST(10); 
        tree.root.left = new BST(5); 
        tree.root.right = new BST(12); 
        tree.root.left.left = new BST(4); 
        tree.root.left.right = new BST(7); 
        
        tree.root.left.right.left = new BST(8); 
        tree.root.left.right.right = new BST(9); 
        
        tree.root.right.left = new BST(11); 
        tree.root.right.right = new BST(15); 
        
        
        System.out.println("Find ancestor:"+ tree.findAncestor(tree.root, 7, 15).value);
        
        if(tree.v1 && tree.v2)
        	System.out.println("exist");
        else
        	System.out.println("not exist");
  
	}
}
class BST{
	int value;
	BST left;
	BST right;
	boolean isVisited;
	BST(int value){
		this.value = value;
		left=right=null;
	}
}
