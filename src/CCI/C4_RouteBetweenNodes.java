package CCI;

import CCI.Queue12.Element;

public class C4_RouteBetweenNodes {
	
	class Graph{
		public Node[] nodes;
		
		Graph(Node[] nodes){
			this.nodes= nodes;
		}
	}
	
	class Node{
		int data;
		Node[] adjacentNodes= new Node[3];
		boolean visited;
		Node(int data){
			this.data=data;
		}
	}
	
	public static void main(String s[]){
		
		C4_RouteBetweenNodes nodes= new C4_RouteBetweenNodes();
		Node node0= nodes.new Node(0);
		Node node1= nodes.new Node(1);
		Node node2= nodes.new Node(2);
		Node node3= nodes.new Node(3);
		Node node4= nodes.new Node(4);
		Node node5= nodes.new Node(5);
		
		node0.adjacentNodes[0] = node1;
		node0.adjacentNodes[1] = node4;
		//node0.adjacentNodes[2] = node5; //,node5,node4};
		
		node1.adjacentNodes[0] = node4;
		node1.adjacentNodes[1] = node3;
		node1.adjacentNodes[2] = null;
		
		node2.adjacentNodes[0] = node1;
		node2.adjacentNodes[1] = null;
		node2.adjacentNodes[2] = null;
		
		node3.adjacentNodes[0] = node2;
		node3.adjacentNodes[1] = node4;
		node3.adjacentNodes[2] = null;
		
		node4.adjacentNodes[0] = null;
		node4.adjacentNodes[1] = null;
		node4.adjacentNodes[2] = null;
		
		node5.adjacentNodes[0] = null;
		node5.adjacentNodes[1] = null;
		node5.adjacentNodes[2] = null;
		
		findRoute(node0, node5);
		
	}
	

	private static void findRoute(Node node0, Node node3) {
		// TODO Auto-generated method stub
		
		Queue queue= new Queue();
		queue.insert(node0);
		node0.visited=true;
		
		while(!queue.isEmpty()) {
			Node node= (Node) queue.delete();
			System.out.println("data "+node.data);
			// 1 4 5 4 3
			if(node!=null && node.data==node3.data)
			{
				System.out.println("There exist a path");
				break;
			}
			
			for(int i=0; i< node.adjacentNodes.length;i++) {
				if(node.adjacentNodes[i]!=null && !node.adjacentNodes[i].visited) {
					queue.insert(node.adjacentNodes[i]);
					node.visited=true;
					//System.out.println(node.adjacentNodes[i].data);
				}
			}
			
		}
		
	}
}


