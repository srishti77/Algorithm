import java.util.ArrayList;
import java.util.List;

public class BFSTraversal {

	public static void main(String args[]) {
		
		BFSTraversal bfs = new BFSTraversal();
		BFSNode A = new BFSNode(1);
		BFSNode B = new BFSNode(2);
		BFSNode S = new BFSNode(3);
		BFSNode C = new BFSNode(4);
		BFSNode D = new BFSNode(5);
		BFSNode G  = new BFSNode(6);	
		BFSNode F = new BFSNode(7);
		BFSNode E = new BFSNode(8);
		BFSNode H  = new BFSNode(9);
		
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
		
		bfs.findBFS(A);
	}
	
	public void findBFS(BFSNode A) {
		Queue queue = new Queue();
		List<BFSNode> newArray = new ArrayList<BFSNode>();
		queue.enqueue(A);
		System.out.println(A.data);
		A.visited = true;
		while(!queue.isEmpty()) {
		
			//System.out.println(queue.peek().data);
			queue.peek().visited = true;
			newArray = queue.peek().getNeighbours();
			for(int i = 0; i< newArray.size(); i++) {
				if(!newArray.get(i).visited) {
					queue.enqueue(newArray.get(i));
					newArray.get(i).visited = true;
				}
					
			}
			String dequedValue = queue.dequeue().data +"";
			if(dequedValue != null)
			System.out.println(dequedValue);
			
		}
		
	}
	
}

class Queue{
	BFSNode array[] = new BFSNode[100];
	
	int front= 0,rear = 0;
//	public static void main(String args[]) {
//		BFSTraversal queue = new BFSTraversal();
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.dequeue();
//		queue.enqueue(40);
//		queue.dequeue();
//		queue.enqueue(50);
//		queue.enqueue(60);
//		queue.dequeue();
//		
//		queue.display();
//		
//	}
	
	public void enqueue(BFSNode node) {
		
		if(rear >= 0) {
			
			array[rear] = node;
			rear++;
		}
		
	}
	
	public BFSNode dequeue() {
		if(front == rear) {
			System.out.println("Queue Empty");
			return null;
		}
		else {
			++front;
			return array[front];
		}
		
		
	}
	public void display() {
		for(int i=front; i<=rear;i++)
			System.out.println(array[i]);
	}
	
	public BFSNode peek() {
		return array[front];
	}
	
	boolean isEmpty() {
		if(front == rear)
			return true;
		return false;
	}
	
}

class BFSNode{
	
	int data;
	List<BFSNode> neighbours = new ArrayList<BFSNode>();;
	boolean visited = false;
	BFSNode(int data){
		
		this.data = data;
		
	}
	
	List getNeighbours() {
		return neighbours;
	}
	
	void addNeighbour(BFSNode neighbour) {
		neighbours.add(neighbour);
	}
	
}
