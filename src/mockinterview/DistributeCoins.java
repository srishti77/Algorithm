package mockinterview;

public class DistributeCoins {
	int ans = 0;

	public static void main(String s[]) {
		
		Treenode tree = new Treenode(0);
		
	}

	public int distributeCoins(Treenode root) {
		
		dfs(root);
		return ans;
		
	}
	
	public int dfs(Treenode root) {
		
		if(root == null) return 0;
		
		int L = dfs(root.left);
		int R = dfs(root.right);
		ans += Math.abs(L) + Math.abs(R);
		
		return root.val +L +R-1;
	}
}
