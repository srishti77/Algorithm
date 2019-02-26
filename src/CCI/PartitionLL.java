package CCI;

public class PartitionLL {
	
	public static void main(String s[]) {
		
		GoogleList googleList1 = new GoogleList(3);
		GoogleList googleList2 = new GoogleList(5);
		GoogleList googleList3 = new GoogleList(8);
		GoogleList googleList4 = new GoogleList(5);
		GoogleList googleList5 = new GoogleList(10);
		GoogleList googleList6 = new GoogleList(2);
		GoogleList googleList7 = new GoogleList(1);
		
		googleList1.next = googleList2;
		googleList2.next = googleList3;
		googleList3.next = googleList4;
		googleList4.next = googleList5;
		googleList5.next = googleList6;
		googleList6.next = googleList7;
		
		PartitionLL partitionLL = new PartitionLL();
		partitionLL.print(partitionLL.partitionOfElement(googleList1, 3));	
	}

	
	private void print(GoogleList googleList1) {
		while(googleList1 != null) {
			System.out.println("List element: "+ googleList1.data);
			googleList1 = googleList1.next;
		}
	}
	
	
	private GoogleList partitionOfElement(GoogleList googleList1, int partition) {
		//GoogleList head = googleList1;
		GoogleList curr= googleList1, prev= null, value= null, insert = null;
		
		while(curr != null) {
		
			if(curr.data >= partition) {
				
				if(insert == null && value == null) {
					System.out.println("Data: "+ curr.data);
					insert = prev;
					value = curr;
				}
			}
			
			else if(curr.data < partition){
			
				if(value != null && insert != null) {
					System.out.println("Data to shift: " + curr.data);
					GoogleList temp = curr.next;
					prev.next = temp;
					curr.next = value;
					insert.next = curr;
					value = curr;
					curr = prev;
					
				}
				else if( insert == null) {
					
					System.out.println("Data to shift: " + curr.data);
					GoogleList temp = curr.next;
					prev.next = temp;	
					insert= curr;
					insert.next = value;
					googleList1 = insert;
					curr.next = value;
					//value = curr;
					curr = prev;
				}
			}
			prev = curr;
			curr = curr.next;
		}
		return googleList1;	
	}	
	
}


class GoogleList{
	
	int data;
	GoogleList next;
	
	GoogleList(int data){
		this.data = data;
	}
	
}