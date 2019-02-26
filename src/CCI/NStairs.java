package CCI;

public class NStairs {

	public static void main(String s[]) {
		int number = 15;
		int stairs[] = new int[number + 1];
		System.out.println(countWaysToClimb(number, stairs));
	}

	private static int countWaysToClimb(int number, int[] stairs) {
		// TODO Auto-generated method stub
		if (stairs[number] != 0)
			return stairs[number];

		if (number == 1 || number == 2) {
			stairs[number] = number;
			return number;
		}

		stairs[number] = countWaysToClimb(number - 1, stairs) + countWaysToClimb(number - 2, stairs);
		return stairs[number];
	}
}
