/**
 * 
 */
package CCI;

/**
 * @author User
 *
 */
public class C4_OneAway {
	
	String word1= "bake";
	String word2="pale";
	public static void main(String s[]) {
		C4_OneAway oneAway= new C4_OneAway();
		oneAway.oneEdit();
	}
	public void oneEdit() {
		if(word1.length()== word2.length())
			oneReplace();
		else if(word1.length() > word2.length())
			oneInsert();
		else
			oneRemove();
	}
	private void oneRemove() {
		
		boolean removed= false;
		int k=0;
		int i;
		for( i=0; i< word2.length() && k<word1.length(); i++) {
			if(word1.charAt(k) != word2.charAt(i))
			{
				if(!removed) {
					removed = true;
					
				}
				else {
					removed= false;
					break;
				}
					
			}
			else
				k++;
			
		}
		print(removed);
	}
	private void oneInsert() {
		// TODO Auto-generated method stub
		
		boolean insert= false;
		int k=0;
		int i;
		for( i=0; i< word2.length() && k<word1.length(); i++) {
			if(word1.charAt(k) != word2.charAt(i))
			{
				if(!insert) {
					insert = true;
					
				}
				else {
					insert= false;
					break;
				}
				i--;	
			}
			k++;
			
		}
		if(!insert && word1.length()-i==1)
			insert= true;
		
		print(insert);
		
	}
	private void oneReplace() {
		// TODO Auto-generated method stub
		boolean replace= false;
		int k=0;
		int i;
		for( i=0; i< word2.length() && k<word1.length(); i++) {
			if(word1.charAt(k) != word2.charAt(i))
			{
				if(!replace) {
					replace = true;
					
				}
				else {
					replace= false;
					break;
				}
					
			}
			k++;
			
		}
		
		print(replace);
			
	}
	public void print(boolean flag)
	{
		if(flag)
			System.out.println("One edit away");
		else
			System.out.println("Not one edit away");
	}
}
