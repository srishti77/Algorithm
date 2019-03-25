package mockinterview;

public class TimeNextClosest {
	public static void main(String s[]) {
		TimeNextClosest timeNext = new TimeNextClosest();
		System.out.println(timeNext.nextClosestTime("18:42"));
	}

	public String nextClosestTime(String time) {

		time = time.replace(":", "");
		int times[] = new int[4];

		for (int i = 0; i < time.length(); i++) {
			times[i] = Integer.parseInt(time.charAt(i) + "");
		}

		int smallestNumber = smallestNumber(times);
		String s = "";
		boolean flag = false;

		int findNextLast = findNextLargest(times, times[3]);

		if (findNextLast == times[3]) {
			s = "" + smallestNumber;
		} else if (findNextLast > times[3]) {
			s = "" + findNextLast;
			flag = true;
		}
		if (flag == true) {
			s = times[0] +""+ times[1] + ":" + times[2] + s;
			return s;
			
		} else {
			int find3rdPOsition = findNextLargest(times, times[2]);

			if ((find3rdPOsition > times[2] && find3rdPOsition < 6) || (find3rdPOsition == times[2] && flag)) {
				s = find3rdPOsition + s;
				flag = true;
			} else if (smallestNumber < 6) {
				s = smallestNumber + s;
			} else {
				s = 0 + s;
			}
			if (flag) {
				s = times[0] + times[1] + ":" + s;
				return s;
				
			} else {
				s = ":" + s;

				int secondEle = findNextLargest(times, times[1]);
				if ((secondEle > times[1] && secondEle <= 3) || (secondEle == times[1] && flag)) {
					s = secondEle + s;
					flag = true;
				} else if (smallestNumber <= 3) {
					s = smallestNumber + s;
				} else {
					s = 0 + s;
				}
				if (flag) {
					s = times[0] + s;
					return s;
				}
				int firstEle = findNextLargest(times, times[0]);
				if ((firstEle > times[0] && firstEle <= 2) || (firstEle == times[0] && flag)) {
					s = firstEle + s;
					flag = true;
				} else if (smallestNumber <= 2) {
					s = smallestNumber + s;
				} else {
					s = "0" + s;
				}

			}

		}

		return s;
	}

	private int smallestNumber(int[] times) {
		// TODO Auto-generated method stub
		int ele = times[0];

		for (int i = 1; i < times.length; i++) {
			ele = Math.min(ele, times[i]);
		}
		return ele;
	}

	private int findNextLargest(int[] times, int a) {
		System.out.println("a"+a);
		int diff = times[0] - a;
		int index = 0;

		for (int i = 1; i < 4; i++) {
			int val = (times[i] - a);
			if (diff >0 && diff > val) {

				index = i;
				diff = val;

			}
		}
		if (diff < 0)
			return a;
		return times[index];
	}
}
