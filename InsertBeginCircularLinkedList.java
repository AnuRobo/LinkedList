package dsa;

class Node19{
	int data;
	Node19 next;
	Node19(int x){
		this.data = x;
		this.next = null;
	}
}

public class InsertBeginCircularLinkedList {

	public static void main(String[] args) {
		Node19 head = new Node19(05);
		head.next = new Node19(10);
		head.next.next = new Node19(20);
		head.next.next.next = head;
		
		traverse(head);
		System.out.println("");
		insertAtLast(head, 01); // naive approach O(n), where n is the number of node in the LinkedList
//		insertAtLastt(head, 9); // O(1), optimize
		/*
		 * We store tail, or store both head and tail
		 * You can always insert after the tail and make the new node as head
		 * */
	}
	

	private static void traverse(Node19 head) {
		
		if(head == null) return;
		
		Node19 curr = head;
		
		do {
			System.out.print(curr.data+",");
			curr = curr.next;
		}while(curr != head);
	}
	
	// Naive Approach
	private static void insertAtLast(Node19 head, int i) {
		
		Node19 temp = new Node19(i);
		
		if(head == null) {
			temp.next = temp;
		}else {
			Node19 curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}
		
		traverse(temp);
	}
	
	// Optimize
	private static void insertAtLastt(Node19 head, int i) {
		/*
		 * We insert the new node after the head
		 * After this we swap the data of head and head.next which is the new node
		 * */
		Node19 temp = new Node19(i);
		
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
