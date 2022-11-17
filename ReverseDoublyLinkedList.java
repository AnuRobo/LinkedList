package dsa;

class Node12{
	int data;
	Node12 next;
	Node12 prev;
	Node12(int x){
		this.data = x;
		this.next = null;
		this.prev = null;
	}
}

public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		Node12 head  = new Node12(05);
		Node12 temp1 = new Node12(10);
		Node12 temp2 = new Node12(15);
		Node12 temp3 = new Node12(20);
		
		head.next  = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = temp3;
		temp3.prev = temp2;
		
		traverse(head);
		System.out.println("");
		reverse(head);
	}
	
	private static void traverse(Node12 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + ",");
		traverse(head.next);
	}
	
	private static void reverse(Node12 head) {
//		traverse(head);
		Node12 previousNode = null;
		Node12 curr = head;
		
		while(curr != null) {
			previousNode = curr.prev;
			curr.prev = curr.next;
			curr.next = previousNode;
			curr = curr.prev;
		}
		
		traverse(previousNode.prev);
	}

}
