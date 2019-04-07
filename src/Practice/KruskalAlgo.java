package Practice;

import java.util.Arrays;

import Practice.UnioFindRank.subset;

public class KruskalAlgo {
	
	class Edge implements Comparable<Edge>{

		int src, dest, weight;
		
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.weight - o.weight;
		}
		
	}
	
	int V, E;
	Edge edge[];
	
	KruskalAlgo(int v, int e){
		V=v;
		E=e;
		
		edge = new Edge[E];
		
		for(int i=0; i<e; i++) {
			edge[i] = new Edge();
		}
		
	}
	
/*	void applyKruskal() {
		UnioFindRank unioFindRank = new UnioFindRank(V, E);
		int e=0;
		
		Edge result[] = new Edge[V];
		
		for(int i=0; i< V; i++)
			result[i] = new Edge();
		
		Arrays.sort(edge);
		
		subset[] subset = new subset[V];
		
		for(int i=0; i<V; i++)
			subset[i] = new subset();
		
		for(int v=0; v <V; v++) {
			subset[v].parent = v;
			subset[v].rank =0;
		}	
		int i=0;
		
		while(e <V-1) {
			Edge next_edge= new Edge();
			next_edge = edge[i++];
			int x = unioFindRank.find(subset, next_edge.src);
			
			int y = unioFindRank.find(subset, next_edge.dest);
			
			
			if(x != y){
				result[e++] = next_edge;
				unioFindRank.union(subset, x, y);
			}
		}
	}*/
	
}
