import java.util.Arrays;

/*
 * form the date higher than the given number if, it is higher than 2359 then find the smallest number and repeat it all the time
 * if not find the number higher than the given number.abstract
 * 1259
 * 13:55
 * 13:31
 * 23:59
 * 
 * 
 * 19:34                             1,9 3 4
 * 
 * 13:59
 * 15:11
 * 
 * 
 * 
 *  */

public class NextClosestTime {

	public static void main(String s[]) {
		NextClosestTime close = new NextClosestTime();
		System.out.println(close.nextClosestTime("20:48"));
	}

	public String nextClosestTime(String time) {
		time = time.replace(":", "");
		char[] times = time.toCharArray();
		int currentIndex = 0;
		for (int i = times.length - 1; i >= 0; i--) {
			char newNextChar = findNextBig(times, times[i]);
			if ((newNextChar != ' ') ) {
				char oldValue = times[i];

				times[i] = newNextChar;
				System.out.println(newNextChar);
				if(Integer.parseInt(times[0]+""+times[1]) < 24 && Integer.parseInt(times[2] +""+ times[3]) <60) {
					currentIndex = i;
					break;
				}
				else {
					times[i] = oldValue;
				}
			}
		}

		
		int smallest = findSmallest(time);
		System.out.println("Samllest:" +smallest);
		for (int i = currentIndex + 1; i < times.length; i++) {
			times[i] = (char) (smallest + '0');
		}

		return (times[0]+""+times[1]+":"+times[2]+times[3]);

	}

	public int findSmallest(String str) {
		int minValue = Integer.MAX_VALUE;

		for (int i = 0; i < str.length(); i++) {

			minValue = Math.min(minValue, Integer.parseInt(str.charAt(i)+""));
		}

		return minValue;

	}

	public char findNextBig(char[] str, char s) {
		int value = Character.getNumericValue(s);
		char nextString = ' ';
		int minValue = Integer.MAX_VALUE;
		for (char characters : str) {
			int currentStr = Character.getNumericValue(characters);
			if (currentStr > value) {

				if (minValue > (currentStr - value)) {
					minValue = (currentStr - value);
					nextString = (char) (currentStr + '0');
				}

			}
		}
		return nextString;
	}

}
