package CCI;

public class Trie {
	
	static TrieNode root;
	
	public static void main(String s[]) {
		
		root = new TrieNode();
		Trie trie = new Trie();
		String keys[] = {"the", "a", "there", "answer", "any", 
                "by", "bye", "their"};
		
		for(int i=0; i< keys.length; i++)
			trie.insert(keys[i]);
		
		System.out.println(trie.search("a"));
		System.out.println(trie.search("their"));
		
	}
	
	public void insert(String word) {
		
		int length = word.length();
		TrieNode node = root;
		
		for( int i=0; i<length; i++) {
			int index = word.charAt(i) -'a';
			if(node.children[index] == null)
				node.children[index] = new TrieNode();
			node = node.children[index];
		}
		node.isEnd = true;	
	}
	
	public boolean search(String word) {
		
		int length = word.length();
		TrieNode node = root;
		
		for( int i=0; i<length; i++) {
			int index = word.charAt(i) -'a';
			if(node.children[index] == null)
				return false;
			
			node = node.children[index];
		}
		
		return ( node != null  && node.isEnd);
	}
	
}

class TrieNode{
	
	boolean isEnd;
	TrieNode children[] = new TrieNode[26];
	
	TrieNode() {
		isEnd = false;
		for(int i=0; i<26; i++)
			children[i] = null;
	}
}
