package CCI;

public class BTreeImpl {
	
	BTreeNode root = null;
	
	class BTreeNode{
		
		int t= 3;
		int keys[]  = new int[2*t-1];
		BTreeNode[] child = new BTreeNode[2*t];
		//current number of keys
		int n;
		boolean leaf;
		
		BTreeNode(boolean leaf) {			
			this.leaf = leaf;
		}

		public void insertNonFull(int k) {
			
			int i= n-1;
			
			if(leaf == true) {
						
				//Find the location of the new key to be inserted
				//move all keys to greater place 
				while(i >=0 && keys[i] >k) {
					keys[i+1] = keys[i];
					i--;
				}
				
				keys[i+1] = k;				
				n= n+1;
			}
			else {
				//if node is not a leaf node
				while(i >=0 && keys[i] >k) {
					//keys[i+1] = keys[i];
					i--;
				}
				
				if(child[i+1].n == 2*t-1) {
					splitChild(i+1, child[i+1]);
					
					if(keys[i+1] <k)
						i++;
				}
				child[i+1].insertNonFull(k);
				
			}		
			
		}

		private void splitChild(int i, BTreeNode bTreeNode) {
			
			BTreeNode z = new BTreeNode(bTreeNode.leaf);
			
			z.n = t-1;
			
			for(int j=0; j < t-1; j++)
				z.keys[j] = bTreeNode.keys[j+t];
			
			if(!bTreeNode.leaf) {
				for(int j=0; j<t; j++) {
					z.child[j] = bTreeNode.child[j+t];			
				}			
			}
			
			bTreeNode.n = t-1;
			
			for(int j=n; j>= i+1; j--)
				child[j+1] = child[j];
			
			child[i+1] =z;
			
			for(int j=n-1; j>=i; j++)
				keys[j+1] = keys[j];
			keys[i] = bTreeNode.keys[t-1];
			
			n=n+1;	
			
		}
	}

	public void insert(int k) {
		
		System.out.println("Value: "+k);
		
		if(root == null) {
			
			root= new BTreeNode( true);
			root.keys[0] = k;
			root.n =1;			
		}
		
		else {
			
			//if root is full
			if(root.n == 2*3-1) {
				BTreeNode btreeNodeNew = new BTreeNode(false);
				
				//make old root as the child of new root;
				btreeNodeNew.child[0] = root;
				
				//Split the old root and move 1 key to new root
				btreeNodeNew.splitChild(0, root);
				
				//New root has children 
				int i=0;
				if(btreeNodeNew.keys[0] < k) {
					i++;
				}
				
				btreeNodeNew.child[i].insertNonFull(k);
				
				root = btreeNodeNew;	
			}
			else
				root.insertNonFull(k);
		}
	}
	
	public static void main(String s[]) {
		BTreeImpl t = new BTreeImpl();	
		t.insert(10); 
	    t.insert(20); 
	    t.insert(5); 
	    t.insert(6); 
	    t.insert(12); 
	    t.insert(30); 
	    t.insert(7); 
	    t.insert(17); 
	}
	
}
