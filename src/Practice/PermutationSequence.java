package Practice;

public class PermutationSequence {
	private int N;
	private int k;
	private String ans;
	
	public static void main(String s[]) {
		
		PermutationSequence permutationSeq = new PermutationSequence();
		System.out.println("Ppermutation:"+ permutationSeq.getPermutations(5, 2));
	}
	
	public String getPermutations(int n, int k) {
		this.N =n;
		this.k =k;
		backtrack(1, new boolean[n+1], "");
		return ans;
	}
	
	private void backtrack( int i, boolean used[], String prefix) {
		if(prefix.length() == N) {
			if(k==1) {
				ans = prefix;
			}
			k--;
			return;
		}
		
		if(ans != null)
			return;
		
		for(int j=i; j<=N; j++) {
			
				used[j] = true;
				System.out.println("PRefix: "+(prefix+j)+" "+j);
				backtrack( j+1,used, prefix+j);			
				used[j] = false;				
			
		}
	}
	
	
}
