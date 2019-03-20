package Practice;

import java.util.HashMap;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}

public class DeepCopy {
	HashMap<Node, Node>  map = new HashMap<>();
	
	public static void main(String s[]) {
		DeepCopy deep = new DeepCopy();	
	}
	
	  public Node copyRandomList(Node head) {
	  
		  if(head == null)
			  return null;
		  
		  if(map.containsKey(head)) {
			  return map.get(head);  
		  }
		  
		  Node newNode = new Node(head.val, null, null);
		  map.put(head, newNode);
		  
		  newNode.next = copyRandomList(head.next);
		  newNode.random = copyRandomList(head.random);
		  
		  return newNode;	  
	  }
}
