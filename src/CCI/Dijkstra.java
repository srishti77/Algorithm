import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
	
	int inputCost[] = {0,1000,1000,1000,1000,1000};
	static List<Integer>  visitedNodes = new ArrayList();

	public static void main(String args[]) {
		Dijkstra dis = new Dijkstra();
		int inputArray[][] = {
				{0,4,2,0,0,0},
				{4,0,1,5,0,0},
				{2,1,0,8,10,0},
				{0,5,8,0,2,6},
				{0,0,10,2,0,3},
				{0,0,0,0,0,0},
		};
			
				
		int currentNodeIndex = 0;
		visitedNodes.add(currentNodeIndex);
		while(visitedNodes.size() <= dis.inputCost.length) {
			
			int newValue;
			for(int j = 0; j< dis.inputCost.length; j++) {
				if(inputArray[currentNodeIndex][j] > 0 && !visitedNodes.contains(j)) {
					
					 newValue	= dis.inputCost[currentNodeIndex]+ inputArray[currentNodeIndex][j];
					if(newValue < dis.inputCost[j])
						dis.inputCost[j] = newValue;
				}
			}
			List<Integer> notVisit = dis.allNodeNotVisitedYet();
			if(!notVisit.isEmpty()){
				currentNodeIndex = dis.findMin(notVisit);
				
			}
			visitedNodes.add(currentNodeIndex);	
			
		}
		
		for(int i= 0; i< dis.inputCost.length; i++ ) {
			System.out.println(dis.inputCost[i]);
		}
	}
	
	public List<Integer> allNodeNotVisitedYet() {
		List<Integer>  NotVisitedNodes = new ArrayList();
		for(int i = 0; i<inputCost.length; i++) {
			if(!visitedNodes.contains(i)) {
				NotVisitedNodes.add(i);
				
			}
				
		}
		return NotVisitedNodes;
				
	}



	
	public Integer findMin(List<Integer> list) {
		if(list.size() > 0) {
		Integer min = inputCost[list.get(0)];
		int minIndex = list.get(0);
		for(int i = 1; i<list.size();i++) {
			if(min > inputCost[list.get(i)] ) {
					min = inputCost[list.get(i)];
					minIndex = list.get(i);
					
				}			
		}
		
		return minIndex;
		}
		return null;
	}
	
	
}
