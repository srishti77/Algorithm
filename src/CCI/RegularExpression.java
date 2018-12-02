package CCI;

/*
 *  '*' means matches 0 or more of the previous characters
 *  '.' matches any character
 */
public class RegularExpression {
	
	public static void main(String s[]) {
		 char[] value1 = {'a', 'b','b'};
		 char[] value2 = {'a', '*','b'};
		 
		 System.out.println(isMatch(value1, value2, 0,0));
		 }

	private static boolean isMatch(char[] value1, char[] value2, int index1, int index2) {
		// TODO Auto-generated method stub
	 if( (index1 >= value1.length && index2>= value2.length) && value1[index1] !='.' && value2[index2] != '.' && value1[index1] !='*' && value2[index2] != '*' )
			return false;
		
		else {
			if(value1[index1] != value2[index2]) {
				if(value1[index1] != '*' || value2[index2] != '*') {
					if((index1< value1.length -1) && (value1[index1+1] == '*'))
						return isMatch(value1, value2, index1+2, index2);
					else if((index2< value2.length -1) && (value2[index2+1] == '*'))
						return isMatch(value1, value2, index1, index2+1);
				}
				else if(value1[index1] == '*') {
					if(value2[index2]==value1[index1-1])
						return isMatch(value1, value2, index1, index2+1);
					else
						return isMatch(value1, value2, index1+1, index2);
				}
				else if(value2[index2] == '*') {
					if(value1[index1]==value2[index2-1])
						return isMatch(value1, value2, index1+1, index2);
					else
						return isMatch(value1, value2, index1, index2+1);
				}
				else
					return false;	
				
			}
			else {
				return isMatch(value1, value2, index1+1, index2+1);
			}
			
		}
		return true;
	}
}
