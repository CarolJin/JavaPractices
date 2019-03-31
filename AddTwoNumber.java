//L1 (2->4->8)
//L2 (5->6->4)
//Output: 7031

/*
public class ListNode {
	int val;
	ListNode next=null;
	ListNode(int x) { 
		val = x; 
		}
}
*/

public class ListNodeTestAddTwoNumbers3 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode prev = null;
		ListNode root = null;
		boolean firstTime = true;
		
		int carry = 0;

		while (l1 != null || l2 != null || carry==1) {
			int sum = 0;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			} 
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			sum+=carry;
			carry =sum/10;
			if (firstTime) {
				root = prev = new ListNode(sum % 10); //Need to keep root no change, so that we can use it 
				firstTime = false;
			} else {
				prev.next = new ListNode(sum % 10);
				prev = prev.next;
			}
		}

		return root; 
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(8);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNodeTestAddTwoNumbers3 result = new ListNodeTestAddTwoNumbers3();
		ListNode rn = result.addTwoNumbers(l1, l2);
		while (rn != null) {
			System.out.print(rn.val);
			rn = rn.next;
		}
	}
}
