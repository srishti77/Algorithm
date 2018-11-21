package CCI;

import java.beans.MethodDescriptor;
import java.util.ArrayList;

public class C10_RankStream {

	public static void main(String arg[]) {
		
		CollectionData collect = new CollectionData();
		collect.methodTrack(5);
		collect.methodTrack(1);
		collect.methodTrack(4);
		collect.methodTrack(4);
		collect.methodTrack(2);
		
		System.out.println(collect.getRank(2));
		collect.print();
		
	}
}
class CollectionData{
	ArrayList<Data> list = new ArrayList<Data>();
	
	public int methodTrack(int value) {
		int max=0;
		boolean flag = false;
		
		for(int i=0; i<list.size();i++) {
			
			
			if(list.get(i).value <value)
			{
				max++;
			}
			else if(list.get(i).value==value) {
				max =list.get(i).rank;
				max++;
				list.get(i).rank= max;
				flag= true;
			}
			
			else {
				int rank = list.get(i).rank;
				list.get(i).rank= rank+1;
			}
		}
		
		if(!flag) {
			Data data= new Data(value);
			data.rank=max;
			list.add(data);
		}
		
		return max;
		
	}
	
	public int getRank(int value) {
		for(int i=0; i<list.size();i++) {
			if(list.get(i).value==value)
				return list.get(i).rank;
		}
		
		return -1;
	}
	
	public void print() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).value);
		}
	}
}

class Data{
	int value;
	int rank;
	
	Data(int value){
		this.value= value;
	}
}