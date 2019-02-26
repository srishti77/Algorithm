package CCI;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobScheduling {
	
	public static void main(String s[]) {
		
		List<Job> list = new ArrayList<Job>();
		Job job1 = new Job("a", 2, 100);
		list.add(job1);
		
		Job job2 = new Job("b", 1, 19);
		list.add(job2);
		
		Job job3 = new Job("c", 2, 27);
		list.add(job3);
		
		Job job4 = new Job("d", 1, 25);
		list.add(job4);
		
		Job job5 = new Job("e", 3, 15);
		list.add(job5);
		
		JobScheduling job = new JobScheduling();
		job.printJobSchedule(list, 5);
	}
	
	void printJobSchedule(List<Job> list, int n) {
		String result[] = new String[n];
		boolean bool[] = new boolean[n];
 		for(int i=0; i<n; i++) {
			bool[i] = false;
			
		}
 		
 		Collections.sort(list, Job.DESCENDING_COMPARATOR );
 		
 		print(list);
 		
 		for(int i=0; i<n; i++) {
 			for(int j = Math.min(n, list.get(i).deadline)-1; j>=0; j--){
 				if(!bool[j]) {
 					System.out.println("J is"+j);
 					result[j] = list.get(i).id;
 					bool[j] = true;
 					break;
 				}
 			}
 		}
 		
 		for(int i=0; i< result.length; i++)
 			System.out.println(result[i]);
 		
	}

	private void print(List<Job> list) {
		// TODO Auto-generated method stub
		for(int i=0; i<list.size(); i++)
			System.out.println("List---"+list.get(i).id);
	}
}

class Job implements Comparable<Job> {
	String id;

	int deadline;
	int profit;
	
	public Job(String id, int deadline, int profit){
		this.id=id;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	 public static final Comparator<Job> DESCENDING_COMPARATOR = new Comparator<Job>() {
	        // Overriding the compare method to sort the age
	        public int compare(Job d, Job d1) {
	            return  d1.profit- d.profit;
	        }
	    };


	@Override
	public int compareTo(Job o) {
		// TODO Auto-generated method stub
		return  (this.id).compareTo(o.id);
	}

}
