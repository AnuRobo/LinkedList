package dsa;

/*
 * ********* Singly vs Doubly Linked List
 * ADVANTAGES
 * 	* Can be traversed in both directions
 * 	* A given delete a node in O(1) time with given reference/pointer to it
 * 	* Insert/Delete before a given node
 * 	* Insert/Delete from both ends O(1) time by maintaining tail.
 * 
 *  DISADVANTAGES
 *   * Extra space for prev
 *   * Code becomes more complex 
 * */

class Node10{
	int data;
	Node10 next;
	Node10 prev;
	
	Node10(int x){
		this.data = x;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		Node10 head  = new Node10(05);
		Node10 temp1 = new Node10(10); 
		Node10 temp2 = new Node10(20); 
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
	}

}
