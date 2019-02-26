		
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZigZagString {

	public static void main(String args[]) {
		
		String s = "PAYPALISHIRING";
		
		List<HashMap<Integer,String>> list= new ArrayList<HashMap<Integer, String>>();	
		int k=0, i=0,j=0;
		int target=4;
		
		while(k < s.length()) {
			if(j==0) {
				HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
				while(j< target && k< s.length()) {
					System.out.println(i+" first "+j);
					hash1.put(j, s.charAt(k)+"");//a[i][j]= s.charAt(k);
					j++;
					k++;
				}
				list.add(hash1);
					j--;
			
			}
			if(j<target) {
				
				while(j>1 && k< s.length()) {
				
					i++;
					j--;
					System.out.println(i +" second "+j);
					HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
					hash1.put(j, s.charAt(k)+"");
					
					list.add(hash1);
					//a[i][j]= s.charAt(k);
					k++;
				}
				i++;
				j--;
				
			}
			
		}

		String firstRow="";
		
		System.out.println("Size: "+ list.size());
		
		for(int o=0; o<target;o++) {
			for(int p=0; p<list.size();p++){
				System.out.println(list.get(1));
				if(list.get(p).get(o)!=null) {
					System.out.println("Value:"+list.get(p).get(o));
					firstRow =firstRow+list.get(p).get(o);
				}
			}
		}
		
		
		
	/*	for(int p=0; p<target;p++) {
			for(int q=0; q<target;q++) {
				System.out.println(2);
				firstRow = firstRow+a[p][q];
			}
				
		}*/
		
		System.out.println(firstRow);
		
	}
}
