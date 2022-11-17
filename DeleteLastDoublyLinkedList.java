package dsa;

// time complexity θ(n)
// we can reduce the time complexity of delete last operation by maintaining tail pointer

class Node14{
	int data;
	Node14 next;
	Node14 prev;
	
	Node14(int x){
		this.data = x;
		this.next = null;
		this.prev = null;
	}
}

public class DeleteLastDoublyLinkedList {

	public static void main(String[] args) {
		Node14 head  = new Node14(05);
		Node14 temp1 = new  Node14(10);
		Node14 temp2 = new  Node14(15);
		
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		traverse(head);
		System.out.println("");
		deleteLastNode(head);
	}

	private static void traverse(Node14 head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + ",");
		traverse(head.next);
	}
	
	private static void deleteLastNode(Node14 head) {
		if(head == null){
			traverse(null);
			return;
		}
		if(head.next == null){
			traverse(null);
			return;
		}
		
		Node14 curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next.prev = null;
		curr.next = null;
		
		traverse(head);
				
	}

}
