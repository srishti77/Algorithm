package CCI;

public class LongestPalindromicSubstance {
	
	boolean input[] = new boolean[5];
	public static void main(String s[]) {
		String str= "bbabb";
		
		LongestPalindromicSubstance palindrome = new LongestPalindromicSubstance();
		palindrome.findLongestSubstance(str, 0);
		System.out.println(palindrome.findSum(palindrome.input));
	}
	
	private int findSum(boolean[] input2) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0; i<input2.length; i++)
		{
			if(input2[i])
				count++;
		}
		
		return count;
	}
	
	private void findLongestSubstance(String str, int index) {
		// TODO Auto-generated method stub
		
		if(index == str.length())
			return;
		
		for(int i=str.length()-1; i>index; i--) {
			if(str.charAt(index) == str.charAt(i) ) {
				input[i] = true;
				input[index] = true;
				//findLongestSubstance(str, index+1);
				break;
			}
		
		}
		findLongestSubstance(str, index+1);
	}
	
	
}
