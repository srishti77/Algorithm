package CCI.google;

public class Redundantconnection {

	public static void main(String s[]) {
		Redundantconnection redundant = new Redundantconnection();
		int[][] edges = {{1,2}, {1,3}, {2,3}};
		int array[] = redundant.findRedundantDirectedConnection(edges);
		
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
		
	}

	public int[] findRedundantDirectedConnection(int[][] edges) {
		int[] roots = new int[edges.length];

		for (int i = 0; i < edges.length; i++)
			roots[i] = i;

		int candidate1[] = null, candidate2[] = null;

		for (int edge[] : edges) {
			int rootx = find(roots, edge[0] - 1), rooty = find(roots, edge[1] - 1);
			System.out.println("Rootx: "+rootx+" "+ rooty);
			if (rootx != rooty) {
				if (rooty != edge[1] - 1)
					candidate1 = edge;
				else
					roots[rooty] = rootx;
			}
			else
				candidate2 = edge; // cycle issue
		}

		if (candidate1 == null)
			return candidate2;
		if (candidate2 == null)
			return candidate1;

		for (int[] e : edges)
			if (e[1] == candidate1[1])
				return e;
		return new int[2];
	}

	private int find(int[] roots, int i) {
		if (i != roots[i]) {
			roots[i] = roots[roots[i]];
			i = roots[i];
		}
		return i;
	}
}
