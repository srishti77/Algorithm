package CCI.google;

import java.util.ArrayList;
import java.util.List;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class InsertInterval {

	public static void main(String s[]) {
		
		InsertInterval insertIntervals = new InsertInterval();
		
		
		List<Interval> intervals = new ArrayList();
		 intervals.add(new Interval(1,2));
		 intervals.add(new Interval(3,5));
		 intervals.add(new Interval(6,7));
		 intervals.add(new Interval(8,10));
		 intervals.add(new Interval(12,16));
		 Interval newInterval = new Interval(4,8);
		 List<Interval> intList = insertIntervals.insert(intervals, newInterval );
		
		 insertIntervals.print(intList);
	}

	public void print(List<Interval> intervals) {
		
		for(Interval i: intervals) {
			System.out.println(i.start+" "+ i.end);
		}
	}
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		int i=0;
		List<Interval> list = new ArrayList<Interval>();
		
		while(i< intervals.size() && intervals.get(i).end < newInterval.start) {
			Interval intv = new Interval(intervals.get(i).start, intervals.get(i).end);
			list.add(intv);
			i++;
		}
		while(i< intervals.size() && intervals.get(i).start <= newInterval.end) {
			newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
			newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
			//iü
			i++;
			
		}
		//i--;
		list.add(newInterval);
	
		list.addAll(intervals.subList(i, intervals.size()));
		return list;
	}
}
