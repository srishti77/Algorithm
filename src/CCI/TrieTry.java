package CCI;

import java.util.ArrayList;

public class TrieTry {
	
	public static void main(String s[]) {
		
		TrieTry trie = new TrieTry();
		String word = "srishti";
		Node12 root = new Node12('z',true);
		trie.insert(word, root, 0);
		
		trie.print(root);
	}
	
	public void print(Node12 root) {
		if(root != null)
		{
			System.out.println(root.character);
			for(int i=0; i<root.children.size(); i++)
				print(root.children.get(i));
		}
	}
	
	public void insert(String word, Node12 root, int index) {
		if(index == word.length())
			return;
		
		for(int i=0; i<root.children.size(); i++) {
			if(word.charAt(index) == root.children.get(i).character) {
				insert(word, root.children.get(i), index+1);
			}		
		}
		root.lastNode =false;
		Node12 node = new Node12(word.charAt(index),true);
		root.children.add(node);
		insert(word, node, index+1);
	
		
	}
}

class Node12{
	char character;
	ArrayList<Node12> children;
	boolean lastNode;
	
	public Node12(char character, boolean lastNode) {
		this.character = character;
		this.lastNode = lastNode;
		children = new ArrayList<Node12>();
	}

	
}