package CCI.google;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 
 *  5
             / \
            4   5
           / \   \
          1   1   5
          	   \   \
          	    2   4
          	         \
          	          1
          	           \
          	            2
          
          Output: 2
          
          
          Algorithm:
          1. For every node write the path to the ArrayList string (path from the current node to root)
          2. Get the all Strings that starts with the current value. get the maximum common substring between them
          3. save it in the HashMap, So that it can be updated
          4. have a varaible that stores the maxValue of the Hash Map so far.
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}

}

public class LongestPathToCommonValue {

	ArrayList<String> arrayList = new ArrayList<String>();
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	int maxLength = 0;

	public static void main(String s[]) {

		LongestPathToCommonValue longestValuePath = new LongestPathToCommonValue();
		/*TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(1);

		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(2);

		TreeNode node7 = new TreeNode(4);
		TreeNode node8 = new TreeNode(1);
		TreeNode node9 = new TreeNode(2);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node4.right = node6;
		node2.right = node5;

		node5.right = node7;
		node7.right = node8;
		node8.right = node9;*/
		
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(1);
		
		root.left = node1;
		
		System.out.println("Length of the Substring:: " + longestValuePath.longestUnivaluePath(root));

	}

	public int longestUnivaluePath(TreeNode root) {
		getPathfromRoot(root, "");
		return maxLength;
	}

	private void getPathfromRoot(TreeNode root, String path) {
		// TODO Auto-generated method stub
		if (root == null) {

			return;
		}

		int currentRoot = root.val;
		String pathSoFar = currentRoot + path;
		arrayList.add(pathSoFar);
		System.out.println(pathSoFar);
		ArrayList<String> array = getAllElementThatStartsWith(currentRoot + "");

		int lengthOfCommonSubstring = getLongestCommonSubstring(array);

		if (map.containsKey(currentRoot)) {
			map.put(currentRoot, Math.max(map.get(currentRoot), lengthOfCommonSubstring));
		} else {
			map.put(currentRoot, lengthOfCommonSubstring);
		}
		maxLength = Math.max(maxLength, lengthOfCommonSubstring);

		getPathfromRoot(root.left, pathSoFar);
		getPathfromRoot(root.right, pathSoFar);

	}

	public int getLongestCommonSubstring(ArrayList<String> list) {

		if (list.isEmpty())
			return 0;
		int size = list.size();
		int commonLength = 0;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {

				String firstString = list.get(i);
				String secondString = list.get(j);

				int minLength = Math.min(firstString.length(), secondString.length());

				int count = 0;
				for (int k = 0; k < minLength; k++) {
					if (firstString.charAt(k) == secondString.charAt(k)) {
						count++;
					} else {
						break;
					}
				}

				commonLength = Math.max(commonLength, count-1);
			}
		}
		return commonLength;
	}

	private ArrayList<String> getAllElementThatStartsWith(String val) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arrayList.size(); i++) {
			String currentStr = arrayList.get(i);

			if (currentStr.startsWith(val)) {
				list.add(currentStr);
			}

		}
		return list;
	}

}
