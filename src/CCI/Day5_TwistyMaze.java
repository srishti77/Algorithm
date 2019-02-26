import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5_TwistyMaze {
	static ArrayList<Integer> arrayInput = new ArrayList<Integer>();
	public static void main(String args[]) {
		int k =0;
		int old_offset = 0;
		try {
			FileInputStream fileInput = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Algorithm\\src\\day5_input.txt");
		
			BufferedReader br = new BufferedReader(new InputStreamReader(fileInput));
			
			String singleline;
			try {
				while((singleline = br.readLine()) != null) {
					
					arrayInput.add(Integer.parseInt(singleline));
					System.out.print(Integer.parseInt(singleline)+ " ");
					k++;
				}
				br.close();
				System.out.println("Count "+k);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int i= 0;
		int count = 0;
		while(i< k){
			System.out.println("1st "+ arrayInput.get(i));
			if(arrayInput.get(i) != 0) {
			
				//arrayInput.set(i,  arrayInput.get(i)+1);
				old_offset = i;
				i = arrayInput.get(i) + i ;
				if(arrayInput.get(old_offset)<3)
				arrayInput.set(old_offset,  arrayInput.get(old_offset)+1);
				
				else
					arrayInput.set(old_offset,  arrayInput.get(old_offset)-1);
				
				
				
				//System.out.println("2nd "+arrayInput.get(i));
			}
				
			
			
			
			else {
				arrayInput.set(i, 1);
				//System.out.println("2nd "+arrayInput.get(i));
			}
			
		//	System.out.println("Current index "+i);
			count++;
			
				
			
			
			
		}
		
		System.out.println("Total steps "+ count);
		
		
		//for(int i = k; k )
	}

}
