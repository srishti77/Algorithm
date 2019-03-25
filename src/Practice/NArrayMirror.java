package Practice;

import javax.swing.text.AsyncBoxView.ChildLocator;

class NArrayTree {
	int val;
	NArrayTree[] children;

	NArrayTree(int val) {
		this.val = val;
	}
}

public class NArrayMirror {

	static NArrayTree tree;

	public static void main(String s[]) {

		NArrayTree root = new NArrayTree(10);

		NArrayTree child1 = new NArrayTree(2);
		NArrayTree child2 = new NArrayTree(34);
		NArrayTree child3 = new NArrayTree(5);
		NArrayTree child4 = new NArrayTree(56);
		NArrayTree child5 = new NArrayTree(100);

		NArrayTree child6 = new NArrayTree(1);

		NArrayTree child7 = new NArrayTree(7);
		NArrayTree child8 = new NArrayTree(8);
		NArrayTree child9 = new NArrayTree(9);

		root.children = new NArrayTree[] { child1, child2, child3, child4, child5 };

		child2.children = new NArrayTree[] { child6 };
		child5.children = new NArrayTree[] { child7, child8, child9 };

		tree = root;

		NArrayMirror mirror = new NArrayMirror();

		mirror.SwapElements(tree);

		mirror.printElement(tree);
	}

	public void printElement(NArrayTree root) {
		if (root != null) {
			System.out.println(root.val);

			if (root.children != null) {
				for (int i = 0; i < root.children.length; i++) {
					// System.out.println(root.children[i].val);
					printElement(root.children[i]);
				}
			}
		}
		
	}

	public void SwapElements(NArrayTree root) {

		if (root == null)
			return;

		if (root.children != null) {
			int length = root.children.length;
			for (int i = 0; i < length / 2; i++) {
				NArrayTree temp = root.children[i];
				root.children[i] = root.children[length - 1 - i];
				root.children[length - 1 - i] = temp;
			}

			for (int i = 0; i < length; i++) {
				SwapElements(root.children[i]);
			}
		}

	}

}
