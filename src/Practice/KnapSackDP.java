package Practice;

public class KnapSackDP {

	public static void main(String s[]) {

		KnapSackDP ks = new KnapSackDP();
		int W = 50;
		int[] val = new int[] { 60, 100, 120 };
		int[] weight = new int[] { 10, 20, 30 };

		int n = weight.length;
		int memo[][] = new int[W + 1][n + 1];
		System.out.println(ks.knapSack(W, val, weight, n, memo));
		System.out.println(ks.newKnapSack(W, val, weight, n));
	}

	public int knapSack(int W, int[] val, int[] weight, int n, int[][] memo) {

		if (n == 0 || W == 0)
			return 0;

		if (memo[W][n] != 0)
			return memo[W][n - 1];
		int result;
		if (weight[n - 1] > W)
			result = knapSack(W, val, weight, n - 1, memo);

		result = Math.max(knapSack(W - weight[n - 1], val, weight, n - 1, memo) + val[n - 1],
				knapSack(W, val, weight, n - 1, memo));
		memo[W][n] = result;
		return result;
	}

	public int newKnapSack(int W, int[] val, int[] weight, int n) {

		int[][] memo = new int[n + 1][W + 1];

		for (int i = 0; i <= n; i++) {

			for (int wt = 0; wt <= W; wt++) {
				if (i == 0 || wt == 0)
					memo[i][wt] = 0;

				else if (weight[i - 1] <= wt)
					memo[i][wt] = Math.max(val[i - 1] + memo[i - 1][wt - weight[i - 1]], memo[i - 1][wt]);

				else
					memo[i][wt] = memo[i - 1][wt];
			}
		}

		return memo[n][W];
	}

}
