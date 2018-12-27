package CCI;

public class DijkrastraShortestPath {
	
	public static void main(String s[]) {
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
            {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
            {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
            {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
            {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
            {0, 0, 4, 14, 10, 0, 2, 0, 0}, 
            {0, 0, 0, 0, 0, 2, 0, 1, 6}, 
            {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
            {0, 0, 2, 0, 0, 0, 6, 7, 0} 
           }; 
       
      DijkrastraShortestPath t = new DijkrastraShortestPath(); 
      t.dijkstra(graph, 0); 
	}

	private void dijkstra(int[][] graph, int i) {
		// TODO Auto-generated method stub
		
		int len = graph.length;
		int dist[] = new int[len];
		boolean visited[] = new boolean[len];
		
		for(int p=0; p<len; p++)
		{
			dist[p] = Integer.MAX_VALUE;
			visited[p] = false;
		}
		
		dist[i] = 0;
		
		
		for(int j=0; j<len-1; j++) {		
			int minValue = minDistance(dist, visited);
			visited[minValue] = true;
			
			System.out.println("MinValue::" +minValue);
			
			for(int k=0; k<len; k++) {
				
				if( !visited[k] && graph[minValue][k] !=0 && dist[minValue] != Integer.MAX_VALUE && (dist[minValue] +graph[minValue][k]) < dist[k])
					dist[k] = dist[minValue] +graph[minValue][k];
				
			}
 		}
		
		for(int p=0; p< len; p++) {
			System.out.println(dist[p]);
		}
	}

	private int minDistance(int[] dist, boolean[] visited) {
		// TODO Auto-generated method stub
		int minValue = Integer.MAX_VALUE;
		int index = -1;
		
		for(int i=0; i< dist.length; i++) {
			
			if(minValue > dist[i] && !visited[i]) {
				minValue = dist[i];
				index = i;
			}		
		}
		return index;
	}
}
