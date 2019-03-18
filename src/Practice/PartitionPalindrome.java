package Practice;

public class PartitionPalindrome {

	public static void main(String s[]) {
		PartitionPalindrome pali = new PartitionPalindrome();
		System.out.println(pali.minPalindrome("ababbbabbababa"));
	}

	public int minPalindrome(String str) {

		int n = str.length();

		int[][] c = new int[n][n];
		boolean[][] p = new boolean[n][n];

		int i, j, k, l;

		for (i = 0; i < n; i++) {
			p[i][i] = true;
			c[i][i] = 0;
		}

		for (l = 2; l <= n; l++) {

			for (i = 0; i < n - l + 1; i++) {

				j = i + l - 1;
				System.out.println("i: " + i + " j: " + j + " l: " + l);
				
				if (l == 2)
					p[i][j] = (str.charAt(i) == str.charAt(j));

				else
					p[i][j] = (str.charAt(i) == str.charAt(j)) && p[i + 1][j - 1];

				if (p[i][j] == true)
					c[i][j] = 0;
				else {
					
					c[i][j] = Integer.MAX_VALUE;
					System.out.println();
					for (k = i; k <= j - 1; k++) {
						c[i][j] = Math.min(c[i][j], c[i][k] + c[k + 1][j] + 1);
					}
					
				}
			}
		}
		return c[0][n - 1];
	}
}
