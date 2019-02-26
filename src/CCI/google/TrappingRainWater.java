package CCI.google;

public class TrappingRainWater {

	public static void main(String s[]) {

		TrappingRainWater rain = new TrappingRainWater();
		int array[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(rain.volumeOfWaterStored(array));

	}

	public int volumeOfWaterStored(int array[]) {
		int size = array.length;
		int left[] = new int[size];
		int right[] = new int[size];
		left[0] = array[0];
		right[size - 1] = array[size - 1];
		int sum = 0;
		for (int i = 1; i < size; i++) {
			left[i] = Math.max(left[i - 1], array[i]);
		}

		for (int i = size - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], array[i]);
		}

		for (int i = 0; i < size; i++) {
			sum += Math.min(left[i], right[i]) - array[i];
		}
		return sum;
	}

}
