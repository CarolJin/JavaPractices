import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListInsertToTheEnd {

    public static Node insert(Node head,int data) {
        if(head == null) {
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);

        Node start = head;

        while(start.next!=null) {
            start= start.next;
        }

        start.next = newNode;
        newNode.next = null;
            
        return head;
    }
	
/*
public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
}
*/

//Remove dup from sorted LinkedList	
public static Node removeDuplicates(Node head) {
        if(head!=null) {
            Node current = head;
            while(current.next!=null) {
                if(current.data==current.next.data){
                    current.next = current.next.next;
                }
                else {
                    current = current.next;
                }
            }
            return head;
        }
      return null;
 }

//Remove dup from unsorted LL
public static void removeDuplicate2(node head)  
    { 
        HashSet<Integer> hs = new HashSet<>(); 

        node current = head; 
        node prev = null; 
        while (current != null)  
        { 
            int curval = current.val; 
              
            if (hs.contains(curval)) { 
                prev.next = current.next; 
            } else { 
                hs.add(curval); 
                prev = current; 
            } 
            current = current.next; 
        } 
  
    } 
	

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
