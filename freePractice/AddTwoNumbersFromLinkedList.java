package freePractice;

import java.util.Iterator;
import java.util.LinkedList;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

public class AddTwoNumbersFromLinkedList {
	public static void main(String[] args) {
	    LinkedList<Integer> l1 = new LinkedList<Integer>();
	    l1.add(2);
	    l1.add(4);
	    l1.add(3);
	    LinkedList<Integer> l2 = new LinkedList<Integer>();
	    l2.add(5);
	    l2.add(6);
	    l2.add(4);
	    LinkedList result = addTwoNumbers(l1,l2);
	    System.out.println(result);

	}
	public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
	    LinkedList result = new LinkedList();
	    Iterator<Integer> i1 = l1.iterator();
	    Iterator<Integer> i2 = l2.iterator();
	    int t=0; int r=0;
	    while(i1.hasNext() && i2.hasNext()){
	        int x =  i1.next()+i2.next()+t;
	        t = x/10;
	        r = x%10;
	        result.add(r);
	    }
	    if(t!=0){
	        result.add(t);
	    }
	    return result;
	}
}
