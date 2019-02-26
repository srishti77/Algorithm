package CCI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
	
	public static void main(String s[]) {
		
		TaskScheduler task = new TaskScheduler();
		char[] availableTask = {'A','A','A','B','B','B'};
		System.out.println(task.leastInterval(availableTask, 2));
		
	}
	
	public int leastInterval(char[] tasks, int n) {
	    
		int map[] = new int[26];
		
		for(char task: tasks) {
			map[task-'A'] +=1; 
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
		
		for(int c : map) {
			if(map[c] !=0)
				queue.add(map[c]);
		}
		int time =0;
		while(!queue.isEmpty()) {
			
			List<Integer> list = new ArrayList<Integer>();
			int i=0;
			
			while(i<= n) {
				
				if(!queue.isEmpty()) {
					if(queue.peek() >1) {
						list.add(queue.poll()-1);
					}
					else
						queue.poll();
				}
				time++;
				if(queue.isEmpty() && list.size() == 0)
					break;
				i++;
			}
			
			for(int remainingInstance: list)
				queue.add(remainingInstance);
			
		}
		
		return time;
	}	
	
}
