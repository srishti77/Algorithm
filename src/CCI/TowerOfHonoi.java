package CCI;

import java.util.Stack;

public class TowerOfHonoi {
	
	public static void main(String s[]) {
		
		Towers[] tower = new Towers[3];
		
		for(int i=0; i<3; i++)
			tower[i] = new Towers(i);
		
		for(int i=4; i>=0; i-- )
			tower[0].add(i);
		
		tower[0].moveDisks(4, tower[2], tower[1]);
		
		tower[2].print();
	}
}


class Towers{
	Stack<Integer> disk;
	int index;
	
	Towers(int i){
		index = i;
		disk = new Stack<Integer>();
	}
	
	void add(int i) {
		if(!disk.isEmpty() && i > disk.peek()) {
			System.out.println("Cannot insert");
		}
		else {
			disk.push(i);
		}
	}
	
	public void moveToTop(Towers t) {
		int element = disk.pop();
		t.add(element);
		
	}
	
	public void moveDisks(int n, Towers destination, Towers buffer) {
		if(n >0) {
			moveDisks(n-1,  buffer, destination);
			moveToTop(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
	
	public void print() {
		while(!disk.isEmpty()) {
			System.out.println(disk.pop());
		}
	}
}
