package Practice;

public class SortedDLLBST {

	static DoublyLL head = null;

	public static void main(String s[]) {

		 head = new DoublyLL(1);
		DoublyLL node1 = new DoublyLL(2);

		DoublyLL node2 = new DoublyLL(3);
		DoublyLL node3 = new DoublyLL(4);
		DoublyLL node4 = new DoublyLL(5);

		head.next = node1;
		node1.prev = head;

		node1.next = node2;
		node2.prev = node1;

		node2.next = node3;
		node3.prev = node2;

		node3.next = node4;
		node4.prev = node3;

		SortedDLLBST sorted = new SortedDLLBST();
		DoublyLL root = sorted.sortedList(5);
		sorted.printElement(root);
	}

	public void printElement(DoublyLL root) {
		if (root != null) {
			printElement(root.prev);
			System.out.println(root.val);
			printElement(root.next);
		}
	}

	public DoublyLL sortedList(int n) {

		if (n <= 0)
			return null;

		DoublyLL left = sortedList(n / 2);

		DoublyLL root = head;
		System.out.println("Root: " + root.val);
		root.prev = left;

		head = head.next;

		root.next = sortedList(n - (n / 2) - 1);

		return root;

	}
}
