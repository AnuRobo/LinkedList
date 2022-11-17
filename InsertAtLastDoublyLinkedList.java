package dsa;

class Node15{
	int data;
	// self referencing structure 
	Node15 next;
	Node15 prev;
	Node15(int x){
		this.data = x;
		this.next = null;
		this.prev = null;
	}
}

public class InsertAtLastDoublyLinkedList {

	public static void main(String[] args) {
		Node15 head  = new Node15(10);
		Node15 temp1 = new Node15(20);
		Node15 temp2 = new Node15(30);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		printList(head);
		System.out.println("");
		addNodeLast(head,35);
	}

	private static void printList(Node15 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + ",");
		printList(head.next);
	}
	
	private static void addNodeLast(Node15 head, int value) {
		Node15 temp = new Node15(value);
		if(head == null) {
			printList(temp);
		}
		Node15 curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		printList(head);
	}

}
