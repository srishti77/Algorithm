package CCI;

import java.util.LinkedList;

public class C_3_6AnimalShelter {
	LinkedList<Character> list = new LinkedList<Character>();
	
	public static void main(String s[]) {
		C_3_6AnimalShelter animal = new C_3_6AnimalShelter();
		
		animal.list.add('c');
		animal.list.add('d');
		animal.list.add('d');
		animal.list.add('c');
		animal.list.add('c');
		animal.list.add('c');
		animal.list.add('c');
		
		animal.dequeueAny();
		animal.dequeueDog();
		animal.dequeueCat();
		System.out.println(animal.list);
		
	}
	
	private void print() {
		// TODO Auto-generated method stub
		for(char c: list) {
			System.out.println();
		}
	}
	private void dequeueDog() {
		// TODO Auto-generated method stub
		int index=0;
		for(Character c: list) {
			
			if(c == 'd') {
				System.out.println("Removed: "+list.remove(index));
				break;
			}
			index++;
		}
	}
	private void dequeueCat() {
		// TODO Auto-generated method stub
		
		int index=0;
		for(Character c: list) {
			
			if(c == 'c') {
				System.out.println("Removed: "+list.remove(index));
				break;
			}
			index++;
		}
		
	}
	private void dequeueAny() {
		// TODO Auto-generated method stub
		System.out.println("Removed: "+list.remove(0));
		
	}
	
}



class Animal{
	char type;
	Animal(char type){
		this.type = type;
	}
}