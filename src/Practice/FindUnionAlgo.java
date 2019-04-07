package Practice;

public class FindUnionAlgo {

	int V, E;
	Edge[] edges;

	class Edge {
		int src, dest;
	}

	FindUnionAlgo(int v, int e) {
		V = v;
		E = e;
		edges = new Edge[E];

		for (int i = 0; i < e; i++) {
			edges[i] = new Edge();
		}
	}

	int find(int parent[], int i) {
		if (parent[i] == -1) {
			return i;
		}
		return find(parent, parent[i]);
	}

	void Union(int parent[], int x, int y) {
		int xset = find(parent, x);
		int yset = find(parent, y);

		parent[xset] = yset;
	}

	boolean isCycle(FindUnionAlgo graph) {
		int parent[] = new int[graph.V];

		for (int i = 0; i < graph.V; i++) {
			parent[i] = -1;
		}

		for (int i = 0; i < graph.E; i++) {
			int x = graph.find(parent, graph.edges[i].src);
			int y = graph.find(parent, graph.edges[i].dest);

			if (x == y)
				return false;

			graph.Union(parent, x, y);
		}

		return true;
	}
}
