package CCI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

// coins problem
public class C8_Coins {
	
	public static void main(String s[]) {
		
		C8_Coins dup = new C8_Coins();
		
		HashSet<String> str= new HashSet<String>(dup.printPerms());
		System.out.println(str);
		System.out.println("Size "+str.size());
		
	}
	
	ArrayList<String> printPerms(){
		ArrayList<String> result= new ArrayList<String>();
		HashMap<Integer,Character> map= buildFreqTable();
		int n=0;
		
		ArrayList<String> array = printPerms(map);
		
		return array;
	}
	
	private ArrayList<String> printPerms(HashMap<Integer, Character> map) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> listOfList = new ArrayList<ArrayList<String>>();
		
		//initialized all array
		for(int i=0; i<=20; i++) {
			ArrayList<String> intializeList = new ArrayList<String>();			
			intializeList.add(" ");
			listOfList.add(intializeList);
		}
		
		
		for(int w=0; w<=20; w++) {
			ArrayList<String> current = new ArrayList<String>();
			for(Entry<Integer, Character> i: map.entrySet()) {
				if(w >= i.getKey()) {
						ArrayList<String> remArray = listOfList.get(w-i.getKey());
					
						for(int j=0; j<remArray.size(); j++) {
							current.add(remArray.get(j)+i.getValue());			
							
						}
						listOfList.add(w,current);	
					}	
				
				}
			
			}
			
		return listOfList.get(20);
		
	}

	private HashMap<Integer, Character> buildFreqTable() {
		// TODO Auto-generated method stub
		HashMap<Integer, Character> map= new HashMap<Integer, Character>();
		map.put(25,'Q');
		map.put(10,'D');
		map.put(5,'N');
		map.put(1,'P');
		return map;
	}
}
