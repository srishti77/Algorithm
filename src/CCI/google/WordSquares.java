package CCI.google;

import java.util.ArrayList;
import java.util.List;

class TrieNode{
	
	TrieNode[] children = new TrieNode[26];
	boolean isWord;
	TrieNode(){
		
	}
}

public class WordSquares {
	
	public static void main(String s[]) {
		
		WordSquares word = new WordSquares();
		String words[] = {"area","lead","wall","lady","ball"};	
		List<List<String>>  wordsquare =word.wordSquares(words); 
		
		System.out.println(wordsquare);
	}
	
	public void print(List<List<String>> str) {
		for(List list: str) {
			System.out.println(list);
		}
	}
	
	private TrieNode buildTrie(String[] words) {
		TrieNode root = new TrieNode();
		for(String word: words) {
			TrieNode current = root;
			
			for(char c: word.toCharArray()) {
				int index = c-'a';
				if(current.children[index] == null)
					current.children[index] = new TrieNode();
				current = current.children[index];
			}
			current.isWord = true;
		}
		
		return root;
	}
	
	private TrieNode search(TrieNode root, String prefix) {
		TrieNode current = root;
		for(char c: prefix.toCharArray()) {
			int index = c-'a';
			if(current.children[index] == null)
				return null;
			
			current = current.children[index];
		}
		
		return current; 
	}
	
	public String getPrefix(List<String> square, int index) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<index; i++) {
			sb.append(square.get(i).charAt(index));	
		}
		return sb.toString();		
	}
	
	  public List<List<String>> wordSquares(String[] words) {
	        TrieNode root = buildTrie(words);
	        List<List<String>> squares = new ArrayList<>();
	        
	        for (String word : words) {
	            List<String> square = new ArrayList<>();
	            square.add(word);
	            wordSquare(root, word.length(), square, squares);
	        }
	        return squares;
	  }
	    
	
	public void wordSquare(TrieNode root, int len, List<String> square,  List<List<String>> squares ) {
		
		if(square.size() == len)
		{
			squares.add(new ArrayList<>(square));
			return;
		}
		String prefix = getPrefix(square, square.size());
		//System.out.println("prefix "+ prefix);
		TrieNode node = search(root, prefix);
		if(node == null)
			return;
		
		List<String> children = new ArrayList<String>();
		getChildren(node, prefix, children);
		
		for(String child : children) {
			
			square.add(child);
			wordSquare(root, len, square, squares);
			square.remove(square.size()-1);
		}
	}

	private void getChildren(TrieNode node, String prefix, List<String> children) {
		// TODO Auto-generated method stub
		
		if(node.isWord) {
			children.add(prefix);
			return;
			
		}
		
		for(int ui=0; ui<26; ui++) {
			if(node.children[ui] !=null) {
				//System.out.println("Child:"+ prefix + (char)('a'+ui));
				getChildren(node.children[ui], prefix + (char)('a'+ui), children);
			}
				
		}
	}
	
}
