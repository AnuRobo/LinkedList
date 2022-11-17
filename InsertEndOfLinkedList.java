package dsa;

class Node5{
	int data;
	Node5 next;
	// self referencing structure
	Node5(int x){
		this.data = x;
		this.next = null;
	}
}

public class InsertEndOfLinkedList {

	public static void main(String[] args) {
		Node5 head = null;
		
		head = insertEnd(head, 05);
		head = insertEnd(head, 10);
		head = insertEnd(head, 20);
		head = insertEnd(head, 30);
		
		printList(head);
	}

	private static void printList(Node5 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data+" ");
		printList(head.next);
	}

	private static Node5 insertEnd(Node5 head, int i) {
		Node5 temp = new Node5(i);
		
		if(head == null) {
			return temp;
		}
		
		Node5 curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

}
