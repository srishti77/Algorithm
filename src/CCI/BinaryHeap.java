package CCI;
public class BinaryHeap {

	int size;
	
	int i = -1;
	int heap[];
	BinaryHeap( int size){
		
		this.size = size;
		 heap = new int[size];
	}
	
	
	public static void main(String args[]) {
		
		BinaryHeap binaryHeap = new BinaryHeap(5);
		
		binaryHeap.insertHeap(5);
		binaryHeap.insertHeap(1);
		binaryHeap.insertHeap(10);
		binaryHeap.insertHeap(3);
		binaryHeap.insertHeap(4);
		
		binaryHeap.display();
		binaryHeap.delete(10);
		
		binaryHeap.display();
		
		
	}
	
	
	void insertHeap(int value) {
		
		if(i < size) {
			i++;
			heap[i] = value;
			
		}
		if( i > 0)
		p(i);
		
		}
	
	void delete(int value) {
		
		heap[0] = heap[heap.length -1];
	
		size--;
		int j =0;
		while((2*j+2) < heap.length-1) {
		
			int temp;
			if(heap[j] > heap[2*j+1] )
			{
				System.out.println(heap[j] + " "+heap[2*j+1]);
				temp =heap[j];
				heap[j]= heap[2*j+1];
				heap[2*j+1] = temp;
				j = 2*j+1;
			}
			
			else if( heap[j]> heap[2*j +2] ) {
				System.out.println(heap[j] + " "+heap[2*j+2]);
				temp =heap[j];
				heap[j]= heap[2*j+2];
				heap[2*j+2] = temp;
				j = 2*j+2;
			}
		}
		
		
	}
	
	void p( int i) {
		
		if(i >  0  && heap[i] < heap[(i-1)/2]) {
			int temp =heap[i];
			heap[i]= heap[(i-1)/2 ];
			heap[(i-1)/2 ] = temp;
			
		}
			
	}
	
	

	
	void display() {
		System.out.println("sjadhjsadh");
		for(int i= 0 ; i< size; i++)
			System.out.println(heap[i]);
	}
	
	void a() {
		
	}
}
