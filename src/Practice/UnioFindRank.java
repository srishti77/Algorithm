package Practice;

public class UnioFindRank {

	int V, E;

	Edges[] edges;

	class Edges {
		int src, dest;
	}

	public UnioFindRank(int v, int e) {
		// TODO Auto-generated constructor stub
		V = v;
		E = e;

		edges = new Edges[e];

		for (int i = 0; i < e; i++) {
			edges[i] = new Edges();

		}

	}

	public class subset {
		int parent, rank;
	}

	int find(subset[] subset, int i) {
		if (subset[i].parent != i) {
			subset[i].parent = find(subset, subset[i].parent);
		}

		return subset[i].parent;
	}

	void union(subset[] subset, int x, int y) {
		int xroot = find(subset, x);
		int yroot = find(subset, y);

		if (subset[xroot].rank < subset[yroot].rank) {
			subset[xroot].parent = yroot;
		} else if (subset[yroot].rank < subset[xroot].rank) {
			subset[yroot].parent = xroot;
		} else {
			subset[xroot].parent = yroot;
			subset[yroot].rank++;
		}
	}

	public boolean isCycle(UnioFindRank graph) {
		int V = graph.V;
		int E = graph.E;

		subset[] subset = new subset[V];

		for (int v = 0; v < V; v++) {
			subset[v] = new subset();
			subset[v].parent = v;
			subset[v].rank = 0;
		}

		for (int i = 0; i < E; i++) {
			int findX = find(subset, graph.edges[i].src);
			int findY = find(subset, graph.edges[i].dest);

			if (findX == findY)
				return false;

			union(subset, findX, findY);
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Let us create the following graph 0 | \ | \ 1-----2
		 */

		int V = 3, E = 3;
		UnioFindRank graph = new UnioFindRank(V, E);

		// add edge 0-1
		graph.edges[0].src = 0;
		graph.edges[0].dest = 1;

		// add edge 1-2
		graph.edges[1].src = 1;
		graph.edges[1].dest = 2;

		// add edge 0-2
		graph.edges[2].src = 0;
		graph.edges[2].dest = 2;

		if (!graph.isCycle(graph))
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
	}

}
