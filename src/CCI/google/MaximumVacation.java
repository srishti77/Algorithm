package CCI.google;

public class MaximumVacation {

	public static void main(String s[]) {

		MaximumVacation vacation = new MaximumVacation();
		int[][] flights = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };

		int[][] days = { { 1, 3, 1 }, { 6, 0, 3 }, { 3, 3, 3 } };

		System.out.println(vacation.maxVacationDays(flights, days));

	}

	public int maxVacationDays(int[][] flights, int[][] days) {

		if (days == null || days.length == 0 || flights == null || flights.length == 0 || days[0].length == 0
				|| flights[0].length == 0) {
			return 0;
		}

		int n = days.length, k = days[0].length;
		int dp[][] = new int[n][k];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				dp[i][j] = -1;
			}
		}

		dp[0][0] = days[0][0];
		for (int i = 1; i < n; i++) {
			if (flights[0][i] == 1)
				dp[i][0] = days[i][0];
		}

		for (int week = 1; week < k; week++) {
			for (int dest = 0; dest < n; dest++) {
				for (int depart = 0; depart < n; depart++) {
					if (dp[depart][week - 1] != -1 && (flights[depart][dest] == 1 || depart == dest)) {
						dp[dest][week] = Math.max(dp[dest][week], dp[depart][week - 1] + days[dest][week]);
					}
				}
			}
		}

		int res = 0;
		for (int city = 0; city < n; city++) {
			if (dp[city][k - 1] > res)
				res = dp[city][k - 1];
		}

		return res;
	}
}
