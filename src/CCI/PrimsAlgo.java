package CCI;

public class PrimsAlgo {
	
	public static void main(String s[]) {
		
		int graph[][] = {{0,2,0,6,0},
				{2,0,3,8,5},
				{0,3,0,0,7},
				{6,8,0,0,9},
				{0,5,7,9,0}
				};
		
		PrimsAlgo prims = new PrimsAlgo();
		prims.primsMST(graph);
		
	}

	private void primsMST(int[][] graph) {
		// TODO Auto-generated method stub
		int len = graph.length;
		int dist[] = new int[len];
		boolean visited[] = new boolean[len];
		
		for(int i=0; i< len; i++) {
			dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		dist[0] = 0;
		
		for(int i=0; i< len-1; i++) {
			int u= minIndex(dist,  visited);
			visited[u] = true;
			
			for(int j=0; j< len; j++) {
				if(!visited[j] && graph[u][j] != 0 && dist[j] > graph[u][j]) {
					dist[j] =  graph[u][j];
				}
			}
			
		}
		
		for(int i=0; i< len; i++)
			System.out.println("Value is: "+ dist[i]);
	}

	private int minIndex(int[] dist, boolean[] visited) {
		// TODO Auto-generated method stub
		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;
		
		for(int i=0; i< dist.length; i++) {
			if(minValue > dist[i] && !visited[i]) {
				minValue = dist[i];
				minIndex = i;
				
			}
			
		}
		return minIndex;
	}
}
