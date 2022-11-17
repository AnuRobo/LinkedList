package dsa;

class Node6{
	int data;
	// self referencing structure
	Node6 next;
	Node6(int x){
		this.data = x;
		this.next = null;
	}
}

public class DeleteFirstNodeLinkedList {

	public static void main(String[] args) {
		Node6 head = null;
		head = insertEnd(head, 05);
		head = insertEnd(head, 10);
		head = insertEnd(head, 20);
		head = insertEnd(head, 30);
		
		printList(head);
		System.out.println("");
		head = removeFirst(head);
		
		printList(head);
	}
	
	private static Node6 insertEnd(Node6 head, int i) {
		Node6 temp = new Node6(i);
		
		if(head == null) {
			return temp;
		}
		
		Node6 curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = temp;
		return head;
	}

	// Traversing List
	private static void printList(Node6 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printList(head.next);
	}

	private static Node6 removeFirst(Node6 head) {
		if(head == null) {
			return null;
		}else {
			return head.next;
		}
	}

}
