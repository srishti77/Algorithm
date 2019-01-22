package CCI;

public class CheapestFlights {
	
	public static void main(String s[]) {
		
		int flights[][] = {{0,100, 500},
				{0,0,100},
				{0,0,0}};
		
		CheapestFlights cheap = new CheapestFlights();
		int value =cheap.findCheapestPrice(3, flights, 0, 2,0);
		//System.out.println("Value "+value);
		
		cheap.dijkrastraAlgo(flights.length,flights,0,2,1);
	}
	
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int i) {
		
			if( dst ==0 || i==2) {
				return 0;
			}
			else {
				System.out.println(src +" "+ (dst-i));
				
				return Math.min(flights[0][dst-i] + findCheapestPrice(n,flights,0,dst,i+1) , flights[1][dst-i] + findCheapestPrice(n, flights, 1,dst,i+1));
					
			}
	  }
	
	public int dijkrastraAlgo(int n, int[][] flight, int src, int dst, int count) {
		int length = n;
		int dist[] = new int[length];
		int path[] = new int[length];
		
		boolean visited[] = new boolean[length];
		for(int p=0; p<length; p++) {
			dist[p] = Integer.MAX_VALUE;
			visited[p] = false;
			path[p] = -1;
		}
		dist[src]=0;
		
		for(int k=0; k<length; k++) {
			int visitNext = minDist(dist, visited);
			visited[visitNext] = true;
			
			for(int p=0; p<length; p++) {
				if(!visited[p] && flight[visitNext][p] != 0 && dist[visitNext] != Integer.MAX_VALUE && (dist[visitNext] + flight[visitNext][p] < dist[p]) && path[visitNext] < count) {
					dist[p] = dist[visitNext] + flight[visitNext][p];
					path[p] +=1;
				}
					
			}
		}
		
	System.out.println(dist[dst]);
			return dist[dst];
	}

	private int minDist(int[] dist, boolean[] visited) {
		// TODO Auto-generated method stub
		int minValue =Integer.MAX_VALUE;
		int index =0;
		for(int i=0; i<dist.length; i++) {
			if(dist[i] <minValue && !visited[i]) {
				minValue = dist[i];
				index =i;
			}
		}
		return index;
	}
	
}
