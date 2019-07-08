package ll;

public class RemoveNodeFromDoublyLinkedList {
	 // Driver code 
    public static void main(String[] args) 
    { 
        // Start with the empty list 
        Node head = null; 
  
        // Create the doubly linked list: 
        // 2<->2<->10<->8<->4<->2<->5<->2 
  
        head = push(head, 2); 
        head = push(head, 5); 
        head = push(head, 4); 
        head = push(head, 8); 
        head = push(head, 10); 
  
        System.out.println("Doubly linked list before deletion:"); 
        printList(head); 
  
        int n = 2; 
          
        // delete node at the given position 'n' 
        deleteNodeAtGivenPos(head, n); 
        System.out.println("Doubly linked list after deletion:"); 
        printList(head); 
    }

	static Node push(Node head, int new_data) 
    { 
        Node newNod = new Node();
        newNod.data = new_data;
        
        newNod.next = head;
        newNod.prev = null;
        
        if(head!=null)
        	head.prev = newNod;
        
        //move the head point to the new node
        head = newNod;	
        
        return head;
    } 
   
    static void printList(Node temp) 
    { 
        if (temp == null) 
            System.out.print("Doubly Linked list empty"); 
  
        while (temp != null)  
        { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 

	private static void deleteNodeAtGivenPos(Node head, int n) {
		if(head==null || n<=0) return;
		
		Node current = head;
		
		for(int i =0; i<n && current!=null; i++) {
			current = current.next;
		}
		
		if(current==null) return;
		
		else 
			deleteNode(head, current);
		
	}

	private static Node deleteNode(Node head, Node delNod) {
		if(head==null || delNod==null) return null;
		
		if(head==delNod) 
			head = head.next;
		
		if(delNod.next!=null)
			delNod.next.prev = delNod.prev;
		
		if(delNod.prev!=null)
			delNod.prev.next= delNod.next;
		
		return head;
		
	} 

}

class Node  
{ 
    int data; 
    Node next, prev; 
} 
