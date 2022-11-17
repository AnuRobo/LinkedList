package dsa;

class Node13{
	int data;
	Node13 next;
	Node13 prev;
	
	Node13(int x){
		this.data = x;
		this.next = null;
		this.prev = null;
	}
}

public class DeleteHeadDoublyLinkedList {

	public static void main(String[] args) {
		Node13 head = new Node13(05);
		Node13 temp1 = new  Node13(10);
		Node13 temp2 = new  Node13(15);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		traverse(head);
		System.out.println("");
		deleteFirstNode(head);
	}

	private static void traverse(Node13 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + ",");
		traverse(head.next);
	}
	
	private static void deleteFirstNode(Node13 head) {
		if(head == null) traverse(null);
		if(head.next == null) traverse(null);
		else {
			head = head.next;
			head.prev = null;
			traverse(head);
		}
	}

}
