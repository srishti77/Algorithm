package CCI;
public class TestReplaceString {
	public static void main(String args[]) {
		
		String value= "String[] projectNames";
		String value1= value.replaceAll("\\[", "squareB").replaceAll("\\]","squareE" );
		value= value.replace(value, "<t> "+value1+" </t>");
		System.out.println(value.replaceAll("squareB", "[").replaceAll("squareE", "]"));
	}
}
