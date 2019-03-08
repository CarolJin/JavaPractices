package freePractice;


public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    int carry = 0;
	    ListNode p, dummy = new ListNode(0);
	    p = dummy;
	    while (l1 != null || l2 != null || carry != 0) {
	        if (l1 != null) {
	            carry += l1.val;
	            l1 = l1.next;
	        }
	        if (l2 != null) {
	            carry += l2.val;
	            l2 = l2.next;
	        }
	        p.next = new ListNode(carry%10);
	        carry /= 10;
	        p = p.next;
	    }
	    return dummy.next;
	}
	public static void main(String [] args){
		ListNode l1= new ListNode(2);
		l1.next= new ListNode(4);
		l1.next.next= new ListNode(3);
		ListNode l2= new ListNode(5);
		l2.next= new ListNode(6);
		l2.next.next= new ListNode(4);
		AddTwoNumbers result = new AddTwoNumbers();
		ListNode rn = result.addTwoNumbers(l1,l2);
		while(rn.next!=null){
		 System.out.print("the result is "+ rn.next.toString());
		}
	}
}
