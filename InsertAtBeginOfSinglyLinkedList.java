package dsa;

class Node4{
	int data;
	// self refrencing structure
	Node4 next;
	
	Node4(int x){
		this.data= x;
		this.next = null;
	}
}

public class InsertAtBeginOfSinglyLinkedList {

	public static void main(String[] args) {
		Node4 head = null;
		head = insertBegin(head, 30);
		head = insertBegin(head, 20);
		head = insertBegin(head, 10);
		head = insertBegin(head, 05);
		
		printList(head);
	}
	
	private static Node4 insertBegin(Node4 head, int i) {
		Node4 temp = new Node4(i);
		temp.next = head;
		return temp;
	}

	private static void printList(Node4 head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data+" ");
		printList(head.next);
	}

}
