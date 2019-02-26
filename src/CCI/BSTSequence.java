package CCI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * All sequnce that can make the given BST
 */

public class BSTSequence {
	
	List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
	
	public static void main(String s[]) {
		
		BinaryTree1 root = new BinaryTree1(8);
		BinaryTree1 node1 = new BinaryTree1(4);
		
		BinaryTree1 node2 = new BinaryTree1(10);
		BinaryTree1 node3 = new BinaryTree1(2);
		
		BinaryTree1 node4 = new BinaryTree1(6);
		BinaryTree1 node5 = new BinaryTree1(15);
		
		BinaryTree1 node6 = new BinaryTree1(20);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		BSTSequence seq = new BSTSequence();
		ArrayList<LinkedList<Integer>> sequence = seq.allSequence(root);
		
		seq.printSeq(sequence);
			
	}
	
	
	public void printSeq(ArrayList<LinkedList<Integer>> sequence) {
		
		for(LinkedList<Integer> seq : sequence) {
			System.out.println(seq);
		}
	}
		
	
	public void weaveList(LinkedList<Integer> first, LinkedList<Integer> second,  ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
		
		
		if(first.isEmpty() || second.isEmpty()) {
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(first);
			result.addAll(second);
			results.add(result);
			return;
		}
		
		
		int headFirst = first.removeFirst();
		prefix.addLast(headFirst);
		weaveList(first, second, results, prefix);
		prefix.removeLast();
		first.addFirst(headFirst);
		
		
		int headSecond = second.removeFirst();
		prefix.add(headSecond);
		weaveList(first, second, results, prefix);
		prefix.removeLast();
		second.addFirst(headSecond);
		
	}
	
	public ArrayList<LinkedList<Integer>> allSequence(BinaryTree1 tree){
		
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		
		if(tree == null) {
			result.add(new LinkedList<Integer>());
			return result;
		}
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		
		prefix.add(tree.data);
		
		ArrayList<LinkedList<Integer>> leftSeq = allSequence(tree.left);
		ArrayList<LinkedList<Integer>> rightSeq = allSequence(tree.right);
		
		for(LinkedList<Integer> left: leftSeq) {
			for(LinkedList<Integer> right: rightSeq) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveList(left, right, weaved, prefix);			
				result.addAll(weaved);
				
			}
		}
		
		return result;
	}
	
}
