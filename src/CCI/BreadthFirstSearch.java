package CCI;
public class BreadthFirstSearch {

	int matrix[][] = {
			{0,1,1,1},
			{0,1,0,1},
			{1,1,0,0},
			{0,0,1,0}
			
	};
	int rear =-1, front =1;
	int visitedArray[] = {0,0,0,0};
	int queueArray[] = new int[4] ;
	public static void main(String args[]) {
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.enqueue(12);
		bfs.enqueue(2);
		bfs.dequeue();
		bfs.display();
	}
	
	
	public void enqueue(int value) {
		
		if(rear >= 3 ) {
			System.out.println("The queue is full");
		}
		else {
			queueArray[++rear] = value;
			System.out.println("Inside enqueue");
		}
			
		
		
	}
	
	public int dequeue() {
		if(front<4) {

			  front++;
			  System.out.println("rec");
		}
		else
			System.out.println("Queue underflow");
		return queueArray[0];
	}
	
	public void display()
	{
		for(int i = front; i<rear; i++)
		System.out.println("Array"+queueArray[i]);
	}
	
	
}
