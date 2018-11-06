package CCI;

public class C3_ThreeInOne {
	
	int array[]= new int[7];
	int top1=-1;
	int top2=array.length/3;
	
	int top3= array.length*2/3;
	public void insert(int data, int stackNum) {
		if(stackNum== 1)
			array[++top1]=data;
		else if(stackNum==2)
			array[++top2]=data;
		else if(stackNum==3)
			array[++top3]=data;
	}
	
	public int delete(int stackNum) {
		if(stackNum== 1)
			return array[top1--];
		else if(stackNum==2)
			return array[top2--];
		else if(stackNum==3)
			return array[top3--];
		else
			return -1;
	
	}
	
	public void print(int stackNum) {
		int top=0;
		if(stackNum== 1)
			top=top1;
		else if(stackNum==2)
			top=top2;
		else if(stackNum==3)
			top=top3;
		for(int i=top; i>=0; i-- ) {
			System.out.println(array[i]);
		}
	}
	public int peek(int stackNum) {
		if(stackNum==1)
			return array[top1];
		else if(stackNum==2)
			return array[top2];
		else if(stackNum==3)
			return array[top3];
		return -1;
	}
	public static void main(String s[]) {
		C3_ThreeInOne stack= new C3_ThreeInOne();
		stack.insert(3,1);
		stack.insert(9,1);
		stack.insert(7,1);
		stack.insert(8,2);
		
		System.out.println(stack.peek(1));
		System.out.println(stack.delete(1));
		
		System.out.println(stack.peek(2));
		
	}
}
