package dsa;

class Node18{
	int data;
	Node18 next;
	Node18(int x){
		this.data = x;
		this.next = null;
	}
}

public class InsertLastCircularLinkedList {

	public static void main(String[] args) {
		Node18 head = new Node18(05);
		head.next = new Node18(10);
		head.next.next = new Node18(20);
		head.next.next.next = head;
		
		traverse(head);
		System.out.println("");
//		insertAtBegin(head, 01); // naive approach O(n), where n is the number of node in the LinkedList
		insertAtBeginn(head, 9); // O(1), optimize
		/*
		 * We store tail, or store both head and tail
		 * You can always insert after the tail and make the new node as head
		 * */
	}
	

	private static void traverse(Node18 head) {
		
		if(head == null) return;
		
		Node18 curr = head;
		
		do {
			System.out.print(curr.data+",");
			curr = curr.next;
		}while(curr != head);
	}
	
	// Naive Approach
	private static void insertAtBegin(Node18 head, int i) {
		
		Node18 temp = new Node18(i);
		
		if(head == null) {
			temp.next = temp;
		}else {
			Node18 curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}
		
		traverse(temp);
	}
	
	// Optimize
	private static void insertAtBeginn(Node18 head, int i) {
		/*
		 * We insert the new node after the head
		 * After this we swap the data of head and head.next which is the new node
		 * */
		Node18 temp = new Node18(i);
		
		if(head == null) {
			temp.next = temp;
			traverse(temp);
		}else {
			temp.next = head.next;
			head.next = temp;

			int tempData;
			tempData = temp.data;
			temp.data = head.data;
			head.data = tempData;
			traverse(head);
		}
	}
	
	

}
