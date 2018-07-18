import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

	
	
	public static void main(String args[]) {
		
		DepthFirstSearch depth = new DepthFirstSearch();
		
		DFSNode A = new DFSNode(1);
		DFSNode B = new DFSNode(2);
		DFSNode S = new DFSNode(3);
		DFSNode C = new DFSNode(4);
		DFSNode D = new DFSNode(5);
		DFSNode G  = new DFSNode(6);
		
		DFSNode F = new DFSNode(7);
		DFSNode E = new DFSNode(8);
		DFSNode H  = new DFSNode(9);
		
		A.addNeighbour(B);
		A.addNeighbour(S);
		
		B.addNeighbour(A);
		
		S.addNeighbour(A);
		S.addNeighbour(C);
		S.addNeighbour(G);
		
		C.addNeighbour(S);
		C.addNeighbour(D);
		C.addNeighbour(E);
		C.addNeighbour(F);
		
		D.addNeighbour(C);
		
		G.addNeighbour(F);
		G.addNeighbour(H);
		G.addNeighbour(S);
		
		F.addNeighbour(G);
		F.addNeighbour(C);
		
		E.addNeighbour(H);
		E.addNeighbour(C);
		
		H.addNeighbour(G);
		H.addNeighbour(E);
		
		depth.findDFS(A);
		
	}
	

	
	void findDFS(DFSNode A) {
		
		DFSNode CurrentNode = A;
		CurrentNode.visited= true;
		//System.out.println(A.data);
		
		Stack stack = new Stack();
		stack.push(A);
		System.out.println(A.data);
		//stack.push(A);
		while(!stack.empty()) {
			CurrentNode = (DFSNode) stack.peek();
			//System.out.println(CurrentNode.data);
			CurrentNode.visited = true;
			List<DFSNode> neighbour = CurrentNode.getNeighbours();
			List newNeighbour = new ArrayList<DFSNode>();
			for(int i = 0; i< neighbour.size(); i++ ) {
				if(!neighbour.get(i).visited && neighbour.get(i) != null )
					newNeighbour.add(neighbour.get(i));
				
			}
			
			if(!newNeighbour.isEmpty())
			{
				stack.push(findSmallest(newNeighbour));
				System.out.println(findSmallest(newNeighbour).data);
			}
			if(newNeighbour.isEmpty())
				stack.pop();
				
		}
		
	}
	
	DFSNode findSmallest(List<DFSNode> neighbour) {
		DFSNode s =  neighbour.get(0);
		for(int i = 0; i<neighbour.size();i++) {
			int currentData = neighbour.get(i).data;
			if(s.data > currentData)
				s= neighbour.get(i);
		}
		//System.out.println();
		return s;
	}
	
}
class DFSNode{
	
	int data;
	List<DFSNode> neighbours = new ArrayList<DFSNode>();;
	boolean visited = false;
	DFSNode(int data){
		
		this.data = data;
		
	}
	
	List getNeighbours() {
		return neighbours;
	}
	
	void addNeighbour(DFSNode neighbour) {
		neighbours.add(neighbour);
	}
	
}