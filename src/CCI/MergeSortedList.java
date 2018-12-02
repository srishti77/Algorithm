package CCI;
public class MergeSortedList {
	 static ListNode current = null;
	public static void main(String s[]) {
		ListNode l1 = new ListNode(1);
		ListNode currentL1 = l1;
		l1.next = new ListNode(2);
		
		l1.next.next = new ListNode(3);
		
		
		ListNode l2 = new ListNode(1);
		ListNode currentL2 = l2;
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = mergeTwoLists(currentL1, currentL2);
	
		while(l3!=null) {
			System.out.println(l3.val);
			l3=l3.next;
		}
		System.out.println(mergeTwoLists(currentL1, currentL2));
		
	}
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 
		 if(l1 == null && l2 == null)
	            return null;
	        
		 ListNode current = new ListNode(0);
		 
		 ListNode l3 = current;
	       
	        int i=0;
	        while(l1!=null && l2!=null){
	        	
	            if(l1.val < l2.val){
	                l3.next = new ListNode(l1.val);
	                l1 = l1.next;
	            }
	            else if(l2.val < l1.val){
	                l3.next = new ListNode(l2.val);
	                l2 = l2.next;
	            }
	            else{
	                l3.next = new ListNode(l2.val);
	                l3.next = new ListNode(l1.val);
	                 l2 = l2.next;
	                l1 = l1.next;
	            }
	          
	            l3 = l3.next;
	        }
	        
	        while(l1!= null){
	            l3.next = new ListNode(l1.val);
	                l1 = l1.next;
	             
	              l3 = l3.next;
	        }
	        
	          while(l2!= null){
	            l3.next = new ListNode(l2.val);
	                l2 = l2.next;
	         
	              l3 = l3.next;
	        }
	          
	        
	        return current.next;
		 
	 }
}

 class ListNode {
    int val;
    ListNode next;
     ListNode(int x) { val = x; }
 }