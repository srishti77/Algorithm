package Practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Phone {

	public static void main(String s[]) {

	}
}

class PhoneDirectory {

	HashSet<Integer> set = new HashSet();
	Queue<Integer> queue = new LinkedList<>();
	int max;

	public PhoneDirectory(int maxNumbers) {
		for (int i = 0; i < maxNumbers; i++) {
			queue.offer(i);
		}
		max = maxNumbers - 1;
	}

	public int get() {
		if(queue.isEmpty())
			return -1;
		int e= queue.poll();
		set.add(e);
		return e;
	}

	public boolean check(int number) {
		return !set.contains(number) && number<= max;
	}

	public void release(int number) {
		if(set.contains(number)) {
			queue.offer(number);
			set.remove(number);
		}
	}
}