package mockinterview;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNodeZigZag {
	int data;
	TreeNodeZigZag left, right;

	TreeNodeZigZag(int data) {
		this.data = data;
	}
}

public class BinaryZigZag {

	List<LinkedList<TreeNodeZigZag>> mainList = new ArrayList<>();
	boolean reverse = false;

	public static void main(String s[]) {
		BinaryZigZag zigzag = new BinaryZigZag();
		TreeNodeZigZag root = new TreeNodeZigZag(3);
		TreeNodeZigZag node1 = new TreeNodeZigZag(9);
		TreeNodeZigZag node2 = new TreeNodeZigZag(20);

		TreeNodeZigZag node3 = new TreeNodeZigZag(15);
		TreeNodeZigZag node4 = new TreeNodeZigZag(17);

		TreeNodeZigZag node5 = new TreeNodeZigZag(8);
		TreeNodeZigZag node6 = new TreeNodeZigZag(10);

		TreeNodeZigZag node7 = new TreeNodeZigZag(19);
		TreeNodeZigZag node8 = new TreeNodeZigZag(18);

		
		root.left = node1;
		root.right = node2;

		node2.left = node3;
		node2.right = node4;

		node1.left = node5;
		node1.right = node6;
		
		node3.left= node7;
		node3.right = node8;

		zigzag.zigzagLevelOrder(root);
		zigzag.print();
	}

	public void print() {

		for (LinkedList<TreeNodeZigZag> list : mainList) {

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).data);
			}

		}
	}

	public List<LinkedList<TreeNodeZigZag>> zigzagLevelOrder(TreeNodeZigZag root) {

		if (root == null)
			return null;

		LinkedList<TreeNodeZigZag> currentList = new LinkedList();
		currentList.add(root);
		mainList.add(new LinkedList<TreeNodeZigZag>(currentList));
		reverse = true;

		LinkedList<TreeNodeZigZag> tempList = new LinkedList();
		while (!currentList.isEmpty()) {

			if (reverse) {
				TreeNodeZigZag element = currentList.remove();
				if (element.left != null)
					tempList.addFirst(element.left);
				if (element.right != null)
					tempList.addFirst(element.right);
			}

			else {
				TreeNodeZigZag element = currentList.removeLast();
				if (element.left != null)
					tempList.add(element.left);
				if (element.right != null)
					tempList.add(element.right);
			}

			System.out.println("element");
			if (currentList.isEmpty()) {

				if (!tempList.isEmpty()) {

					mainList.add(new LinkedList(tempList));
					currentList = new LinkedList<>(tempList);
					tempList.clear();
				} else {
					break;
				}
				
				reverse = !reverse;
			}
		}
		return mainList;

	}
}
