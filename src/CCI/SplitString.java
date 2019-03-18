package CCI;
public class SplitString {

	public static void main(String args[]) {
		String string = "IsProgramming fun";
		
		String parts[] = string.split("((?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z]))|_");
		
		for(String s: parts)
			System.out.println(s);
	}
}
