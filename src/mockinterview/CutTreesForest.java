package mockinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CutTreesForest {
	
	List<int[]> direction = Arrays.asList(new int[] {1, 0}, new int[] {-1, 0}, new int[] {0, -1}, new int[] {0, 1},
			new int[] {1, 1},  new int[] {-1, 1},  new int[] {-1, -1},  new int[] {1, -1} );
	
	boolean[][] visited;
	public static void main(String s[]) {
		CutTreesForest cutTree = new CutTreesForest();
		List<Integer> list1 = new ArrayList();
		//[[1,2,3],[0,0,4],[7,6,5]]
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList();
		list2.add(0);
		list2.add(0);
		list2.add(4);
		
		List<Integer> list3 = new ArrayList();
		list3.add(7);
		list3.add(6);
		list3.add(5);
		
		List<List<Integer>> listOfList = new ArrayList();
		listOfList.add(list1);
		listOfList.add(list2);
		listOfList.add(list3);
		
		System.out.println(cutTree.cutOffTree(listOfList));
		
	}
	
	 public int cutOffTree(List<List<Integer>> forest) {
	     
		 Queue<int[]> queue = new LinkedList<>();
		 
		 forest.get(0).set(0, 1);
		 int m = forest.size();
		 int n = forest.get(0).size();
		 int value = 0;
		 queue.add(new int[] {0,0});
		 visited = new boolean[m][n];
		
		 while(!queue.isEmpty()) {
			 
			 int points[] = queue.remove();
			 visited[points[0]][points[1]] = true;
			 
			 for(int dir[]: direction) {
				 int p = points[0] + dir[0];
				 int q = points[1] + dir[1];
				
				 if(p>=0 && p<m && q >= 0 && q<n && forest.get(p).get(q) >=1 && !visited[p][q]) {
					 forest.get(p).set(q, 1);
					 queue.add(new int[]{p,q});
					 value ++;
				 }
			 }
			 
		 }
		 
		 
		 for(List l: forest) {
			 for(int i= 0; i<l.size(); i++) {
				 System.out.println("I: "+l.get(i));
				 if(i != 0 || i !=1) {
					 System.out.println("cannot cut");
				 }
			 }
		 }
		
		 return value;
	    }
}
