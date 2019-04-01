package Practice;

public class UnionFindAlgo {

	int V, E;
	Edge edge[];

	public static void main(String s[]) {
		Graph graph = new Graph(3, 3);

		graph.edge[0].src = 0;
		graph.edge[0].dest = 1;

		graph.edge[1].src = 1;
		graph.edge[1].dest = 2;

		graph.edge[2].src = 0;
		graph.edge[2].dest = 2;

		UnionFindAlgo unionAlgo = new UnionFindAlgo();

		if (unionAlgo.isCircle(graph) == 1) {
			System.out.println("Graph contains cycle");
		} else
			System.out.println("Graph does not contain cycle");
	}

	int find(int parent[], int i) {
		if (parent[i] == -1)
			return i;
		return find(parent, parent[i]);
	}

	void union(int parent[], int x, int y) {
		int findX = find(parent, x);
		int findY = find(parent, y);

		parent[findX] = findY;
	}

	int isCircle(Graph graph) {

		int parent[] = new int[graph.V];

		for (int i = 0; i < parent.length; i++) {
			parent[i] = -1;
		}

		for (int i = 0; i < graph.E; i++) {
			int findX = find(parent, graph.edge[i].src);
			int findY = find(parent, graph.edge[i].dest);

			if (findX == findY)
				return 1;

			union(parent, findX, findY);
		}

		return 0;

	}
}

class Edge {
	int src, dest;
}

class Graph {

	Edge edge[];
	int V, E;

	Graph(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[e];
		for (int i = 0; i < e; i++) {
			edge[i] = new Edge();
		}
	}
}