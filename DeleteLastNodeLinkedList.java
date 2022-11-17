package dsa;

class Node7{
	int data;
	// self referencing structure
	Node7 next;
	Node7(int x){
		this.data = x;
		this.next = null;
	}
}

public class DeleteLastNodeLinkedList {

	public static void main(String[] args) {
		Node7 head = null;
		head = insertEnd(head, 05);
		head = insertEnd(head, 10);
		head = insertEnd(head, 20);
		head = insertEnd(head, 30);
		
		printList(head);
		System.out.println("");
		head = removeLast(head);
		
		printList(head);
	}
	
	private static Node7 insertEnd(Node7 head, int i) {
		Node7 temp = new Node7(i);
		
		if(head == null) {
			return temp;
		}
		
		Node7 curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = temp;
		return head;
	}

	// Traversing List
	private static void printList(Node7 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printList(head.next);
	}

	private static Node7 removeLast(Node7 head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) return null;
		
		Node7 curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}

}
