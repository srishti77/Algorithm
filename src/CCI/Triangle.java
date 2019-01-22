package CCI;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	
	public static void main(String s[]) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(6);
		list3.add(5);
		list3.add(7);
		
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(3);
		
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);
		
		Triangle triangleImpl = new Triangle();
		System.out.println(triangleImpl.minimumTotal(triangle));
	}
	
	public int minimumTotal(List<List<Integer>> triangle) {
		if(triangle.size() ==0)
			return 0;
		for(int i=1; i<triangle.size(); i++) {
			int start = triangle.get(i).get(0);
			int size= triangle.get(i).size();
			int end = triangle.get(i).get(size-1);
			triangle.get(i).set(0, start+triangle.get(i-1).get(0));
			triangle.get(i).set(size-1, end+triangle.get(i-1).get(triangle.get(i-1).size()-1));
		}
		
		for(int i=2; i< triangle.size(); i++) {
			for(int j=1; j<triangle.get(i).size()-1; j++) {
				int curr = triangle.get(i).get(j);
				triangle.get(i).set(j, Math.min(curr+triangle.get(i-1).get(j-1), curr+ triangle.get(i-1).get(j)));
			}
		}
		
		int value =printMin(triangle.get(triangle.size()-1));
        return value;
    }

	private int printMin(List<Integer> list) {
		// TODO Auto-generated method stub
		int minValue = list.get(0);
		
		for(int i=0; i< list.size(); i++) {
			if(minValue > list.get(i)) {
				minValue = list.get(i);
			}
			//System.out.println(minValue);
		}
		return minValue;		
	}
}
