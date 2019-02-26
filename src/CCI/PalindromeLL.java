package CCI;

public class PalindromeLL {
	public static void main(String s[]) {
		
		GoogleStringLL head  = new GoogleStringLL('a');
		GoogleStringLL node1  = new GoogleStringLL('a');
		
		GoogleStringLL node2  = new GoogleStringLL('b');
		GoogleStringLL node3  = new GoogleStringLL('b');
		
		GoogleStringLL node4  = new GoogleStringLL('a');
		GoogleStringLL node5  = new GoogleStringLL('a');
		
		head.next = node1;
		node1.next = node2;

		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		
		
		PalindromeLL palindrome =  new PalindromeLL();
		
		palindrome.checkPalindrome(head, 6);
		
	}
	
	
	public GoogleStringLL checkPalindrome(GoogleStringLL head , int length) {
		if(head  == null || length <=0)
			return head;
		
		GoogleStringLL res = checkPalindrome(head.next, length -2);
		
		/*if(curr != head  && curr != null) {
			if(curr.data == head.data) {
				System.out.println("Palindrome.." + curr.data +" "+ head.data);
			}
			else {
				System.out.println("Not Palindrome.."  + curr.data +" "+ head.data);
			}
			System.out.println("Palindrome.." + curr.data +" "+ head.data);
			head = head.next;
		}	return curr;*/
		
		if(res == null)
			return res;
		
		System.out.println("Head: "+head.data +" End" +res.data);
//		head = head.next;
		
		
		res = res.next;
		return res;
		}
}
class GoogleStringLL{
	char data;
	GoogleStringLL next;
	
	GoogleStringLL(char data){
		this.data = data;
	}
}