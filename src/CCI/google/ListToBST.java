package CCI.google;

public class ListToBST {
	public static void main(String s[]) {
		ListToBST listToBST = new ListToBST();
		ListNode head = new ListNode(-10);
		ListNode node1 = new ListNode(-3);
		ListNode node2 = new ListNode(0);

		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(9);

		head.next = node1;
		node1.next = node2;

		node2.next = node3;
		node3.next = node4;

		TreeNode root = listToBST.sortedListToBST(head);
		listToBST.print(root);
	}

	public void print(TreeNode root) {
		if (root != null) {
			print(root.left);
			System.out.println(root.val);
			print(root.right);
		}
	}

	public TreeNode sortedListToBST(ListNode head) {

		if (head == null)
			return null;

		if (head.next == null)
			return new TreeNode(head.val);

		ListNode preSlow = head, slow = head, fast = head;

		while (fast != null && fast.next != null) {
			preSlow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		TreeNode root = new TreeNode(slow.val);
		ListNode temp = slow.next;
		preSlow.next = null;
		root.left = sortedListToBST(head);
		root.right = sortedListToBST(temp);
		return root;
	}
}
