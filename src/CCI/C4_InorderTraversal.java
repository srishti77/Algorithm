package CCI;

public class C4_InorderTraversal {
	
	class Node { 
        int data; 
        Node left, right; 
  
        public Node(int item) { 
            data = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    C4_InorderTraversal() {  
        root = null;  
    } 
	
	void insert(int data) {
		root=insertRec(root, data);
	}
	
	 Node insertRec(Node root, int key) { 
		  
	        /* If the tree is empty, return a new node */
	        if (root == null) { 
	            root = new Node(key); 
	            return root; 
	        } 
	  
	        /* Otherwise, recur down the tree */
	        if (key < root.data) 
	            root.left = insertRec(root.left, key); 
	        else if (key > root.data) 
	            root.right = insertRec(root.right, key); 
	        
	        /* return the (unchanged) node pointer */
	        return root; 
	    } 
	  
	    // This method mainly calls InorderRec() 
	    void inorder()  { 
	       inorderRec(root); 
	    } 
	  
	    // A utility function to do inorder traversal of BST 
	    void inorderRec(Node root) { 
	        if (root != null) { 
	            inorderRec(root.left); 
	            System.out.println(root.data); 
	            inorderRec(root.right); 
	        } 
	    } 
	  
	    // Driver Program to test above functions 
	    public static void main(String[] args) { 
	    	
	    	C4_InorderTraversal tree = new C4_InorderTraversal(); 
	  
	        /* Let us create following BST 
	              50 
	           /     \ 
	          30      70 
	         /  \    /  \ 
	       20   40  60   80 */
	        tree.insert(50); 
	        tree.insert(30); 
	        tree.insert(20); 
	        tree.insert(40); 
	        tree.insert(70); 
	        tree.insert(60); 
	        tree.insert(80); 
	  
	        // print inorder traversal of the BST 
	        tree.inorder(); 
	    } 
	} 
	//