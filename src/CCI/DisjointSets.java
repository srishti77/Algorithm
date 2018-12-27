package CCI;

public class DisjointSets {
	int V, E;
	Edge edge[];
	
	class Edge{
		int src, dest;
	}
	
	public DisjointSets(int v, int e) {
		// TODO Auto-generated constructor stub
		V=v;
		E=e;
		
		edge = new Edge[E];
		
		for(int i=0; i<e; i++)
			edge[i] = new Edge();
	}
	
	int find(int parent[], int i) {
		if(parent[i] == -1)
			return i;
		return find(parent, parent[i]);
	}
	
	void union(int parent[], int x, int y) {
		int xset = find(parent, x);
		int yset = find(parent, y);
		
		parent[xset] = yset;
		
	}
	
	int isCycle(DisjointSets disjoint) {
		int parent[] = new int[disjoint.V];
		
		for(int i =0; i< disjoint.V; i++) {
			parent[i]=-1;
		}
		
		for(int i=0; i< disjoint.E; i++) {
			
			int x= disjoint.find(parent, disjoint.edge[i].src);
			int y = disjoint.find(parent, disjoint.edge[i].dest);
			
			if(x == y)
				return 1;		
			disjoint.union(parent, x, y);
		
		}
		return 0;
 	}
	
	public static void main(String s[]) {
		
		int V =3, E=3;
		DisjointSets disjointSets = new DisjointSets(V, E);
		
		disjointSets.edge[0].src = 0;
		disjointSets.edge[0].dest = 1;
		
		disjointSets.edge[1].src = 1;
		disjointSets.edge[1].dest = 2;
		
		disjointSets.edge[2].src = 0;
		disjointSets.edge[2].dest = 2;
		
		if(disjointSets.isCycle(disjointSets) ==1)
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph contain no cycle");
		
		
		
		
	}
}
