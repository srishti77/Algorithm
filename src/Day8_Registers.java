import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day8_Registers {
	static HashMap<String, Integer> set = new HashMap<String, Integer>();
	int age = 21;
	public static void main(String args[]) {
		
		Day8_Registers day8 = new Day8_Registers();
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Algorithm\\src\\day8_Register.txt");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String line;
			
			try {
				while((line = bufferedReader.readLine()) != null) {
					
					String[] lineValue = line.split(" ");
					
					if((set.get(lineValue[5]) == null)) {
						
						if(!day8.checkCondition(lineValue[4], lineValue[5], lineValue[6])) {
							System.out.println(lineValue[4]+" "+ lineValue[5]+" "+ lineValue[6]);
							System.out.println("false");
							break;
						}
						else {
							
						}
					
						
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public boolean checkCondition(String op1, String operator, String op2) {
		
		boolean flag = false;
		
		if(operator.equals("==")) {
			if(op1.equals(op2))
				flag = true;
		}
		else if(operator.equals(">")) {
			if(op1.compareTo(op2) > 0)
				flag = true;
		}
		else if(operator.equals("<")) {
			if(op1.compareTo(op2) < 0)
				flag = true;
		}
		else if(operator.equals(">=")) {
			if(op1.compareTo(op2) >= 0)
				flag = true;
		}
		else if(operator.equals("<=")) {
			if(op1.compareTo(op2) <= 0)
				flag = true;
		}
		else if(operator.equals("!=")) {
			if(op1.compareTo(op2) > 0 || op1.compareTo(op2) < 0)
				flag = true;
		}
		return flag;
	}
	
	public void perforOperation(String op1, String operation, String op2) {
		int temp;
		if(operation.equals("inc")) {
			
			if(set.get(op1) == null) {
				set.put(op1,Integer.parseInt(op1)+ age);
				 
			}
		}
	}
}
