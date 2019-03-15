package CCI.google;

public class BTreeImpl {

	int keys[];
	int t;
	BTreeImpl[] child;
	int n;
	boolean leaf;
	BTreeImpl root;

	BTreeImpl(int t, boolean leaf) {
		this.t = t;
		this.leaf = leaf;
		keys = new int[2 * t - 1];
		child = new BTreeImpl[2 * t];

		n = 0;
	}

	public static void main(String s[]) {

	}

	public void insert(int k) {
		if (root == null) {
			root = new BTreeImpl(t, true);
			root.keys[0] = k;
			root.n = 1;
		}

		else {
			if (root.n == 2 * t - 1) {

				BTreeImpl impl = new BTreeImpl(t, false);
				impl.child[0] = root;
				impl.splitChild(0, root);

				int i = 0;

				if (impl.keys[0] < k) {
					i++;
				}
				impl.child[i].insertNotNull(k);
				root = impl;
			} else
				root.insertNotNull(k);
		}
	}

	private void insertNotNull(int k) {
		// TODO Auto-generated method stub
		int i = n - 1;

		if (leaf == true) {
			while (i >= 0 && keys[i] > k) {
				keys[i + 1] = keys[i];
				i--;
			}
			keys[i + 1] = k;
			n = n + 1;
		}

		else {

			while (i >= 0 && keys[i] > k)
				i--;

			if (child[i + 1].n == 2 * t - 1) {
				splitChild(i + 1, child[i + 1]);
				
				if(keys[i+1] < k)
					i++;
			}
			child[i+1].insertNotNull(k);
		}
	}

	private void splitChild(int i, BTreeImpl root2) {
		// TODO Auto-generated method stub

		BTreeImpl z = new BTreeImpl(root2.t, root2.leaf);
		z.n = t-1;
		
		for( int j=0; j < t-1; j++)
			z.keys[j] = root2.keys[j+t];
		
		if(root2.leaf == false) {		
			for(int j =0; j <t; j++)
				z.child[j] = root2.child[j];
		}
		
		root2.n = t-1;
		
		for(int j =n; j>= i+1; j--)
			child[j+1] = child[j];
		child[i +1] = z;
		
		for(int j =n-1; j>= i; j--)
			keys[j+1] = keys[j];
		
		keys[i] = root2.keys[t-1];
		
		n = n+1;
	}
}
