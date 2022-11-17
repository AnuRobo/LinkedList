package dsa;

class Node11{
	int data;
	// self referencing structure 
	Node11 next;
	Node11 prev;
	Node11(int x){
		this.data = x;
		this.next = null;
		this.prev = null;
	}
}

public class InsertAtBeginDoublyLinkedList {

	public static void main(String[] args) {
		Node11 head  = new Node11(10);
		Node11 temp1 = new Node11(20);
		Node11 temp2 = new Node11(30);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		printList(head);
		System.out.println("");
		addNodeBegin(head, 05);
	}

	private static void printList(Node11 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + ",");
		printList(head.next);
	}
	
	private static void addNodeBegin(Node11 head, int value) {
		Node11 temp = new Node11(05);
		temp.next = head;
		
		if(head != null) {
			head.prev = temp;
		}
		printList(temp);
	}

}
