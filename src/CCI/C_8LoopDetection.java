package CCI;

public class C_8LoopDetection {
	
	public static void main(String s[]) {
		GoogleList googleList1 = new GoogleList(3);
		GoogleList googleList2 = new GoogleList(5);
		GoogleList googleList3 = new GoogleList(8);
		GoogleList googleList4 = new GoogleList(4);
		GoogleList googleList5 = new GoogleList(10);
		GoogleList googleList6 = new GoogleList(2);
		GoogleList googleList7 = new GoogleList(1);
		
		googleList1.next = googleList2;
		googleList2.next = googleList3;
		googleList3.next = googleList4;
		googleList4.next = googleList5;
		googleList5.next = googleList6;
		googleList6.next = googleList7;
		googleList7.next = googleList3;
		
		C_8LoopDetection loop = new C_8LoopDetection();
		System.out.println(loop.detection(googleList1).data);
				
		
	}

	private GoogleList detection(GoogleList googleList1) {
		// TODO Auto-generated method stub
		
		GoogleList slowPointer = googleList1, fastPointer=googleList1;
		while(fastPointer != null && fastPointer.next!=null) {
			System.out.println("Here");
			slowPointer= slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer == fastPointer)
				break;
			//googleList1 = googleList1.next;	
			
		}
		
		slowPointer = googleList1;
		while(slowPointer.data != fastPointer.data) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
		
		return slowPointer;
	}
}
