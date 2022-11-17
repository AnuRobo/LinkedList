package dsa;

class Node8{
	int data;
	Node8 next;
	Node8(int x){
		this.data = x;
		this.next = null;
	}
}

public class InsertAtGivenPosSingly {

	public static void main(String[] args) {
		Node8 head = null;
		head = insertEnd(head,05);
		head = insertEnd(head,10);
		head = insertEnd(head,20);
		head = insertEnd(head,30);
		head = insertEnd(head,40);
		
		printList(head);
		System.out.println("");
		insertAtPos(head,7,15);
	}
	

	private static Node8 insertEnd(Node8 head, int i) {
		Node8 temp = new Node8(i);
		if(head == null) {
			return temp;
		}
		
		Node8 curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	
	private static void printList(Node8 head) {
		if(head == null) {
			return ;
		}
		System.out.print(head.data+" ");
		
		printList(head.next);
	}

	private static void insertAtPos(Node8 head, int pos, int data) {
		int j = 1;
		Node8 curr = head;
		while(j<pos-1) {
			curr = curr.next;
			j++;
		}
		if(curr == null) {
			printList(head);
		}else {
			Node8 newN = new Node8(data);
			newN.next  = curr.next;
			curr.next  = newN;
			printList(head);
		}	
	}
}
