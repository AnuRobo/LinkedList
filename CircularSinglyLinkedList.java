package dsa;

/*
 **************ADVANTAGES***************
 * * We can traverse through the whole list from any node
 * * implementation of algorithms like round robin
 * * We can insert at the beginning and end by maintaining one tail reference/pointer
 * 
 *************DISADVANTAGES*************
 * * Implementation of operations become complex
 * */

class Node16{
	int data;
	// self referencing structure
	Node16 next;
	Node16(int x){
		this.data = x;
		this.next = null;
	}
}

public class CircularSinglyLinkedList {

	public static void main(String[] args) {
		Node16 head = new Node16(05);
		head.next = new Node16(10);
		head.next.next = new Node16(20);
		head.next.next.next = new Node16(30);
		head.next.next.next.next = head;
	}

}
