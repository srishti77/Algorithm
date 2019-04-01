package CCI.google;

public class ConvertLLToBSTArray {
	public static void main(String s[]) {
		int nums[] = { -10, -3, 0, 5, 9 };
		
		ConvertLLToBSTArray convert = new ConvertLLToBSTArray();
		TreeNode root = convert.sortedArrayToBST(nums);
		
		convert.print(root);
	}

	public void print(TreeNode root) {
		if (root != null) {
			print(root.left);
			System.out.println(root.val);
			print(root.right);
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {

		TreeNode root = buildTree(nums, 0, nums.length - 1);
		return root;
	}

	private TreeNode buildTree(int[] nums, int low, int high) {

		if(low < 0 || high >= nums.length || high < low)
			return null;
		
		if (low == high)
			return new TreeNode(nums[low]);

		int mid = (low+high) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = buildTree(nums, low, mid - 1);
		root.right = buildTree(nums, mid + 1, high);
		return root;
	}
}
