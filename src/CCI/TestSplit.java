package CCI;
import java.util.Arrays;

public class TestSplit {
	 static final String keywords[] = {"abstract", "assert", "boolean",
             "break", "byte", "case", "catch", "char", "class", "const",
             "continue", "default", "do", "double", "else", "extends", "false",
             "final", "finally", "float", "for", "goto", "if", "implements",
             "import", "instanceof", "int", "interface", "long", "native",
             "new", "null", "package", "private", "protected", "public",
             "return","short", "static", "strictfp",  "super", "switch",
             "synchronized",  "this", "throw", "throws", "transient", "true",
             "try", "void", "volatile", "while" };

     public static boolean isJavaKeyword(String keyword) {
         return (Arrays.binarySearch(keywords, keyword) >= 0);
     }
	public static void main(String args[]) {
		
		String subtoken_merge= ".";
		System.out.println(!isJavaKeyword(subtoken_merge) && subtoken_merge.matches("[a-zA-Z]*")	);
		
	}
}
