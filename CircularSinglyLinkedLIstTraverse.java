package dsa;

class Node17{
	int data;
	Node17 next;
	Node17(int x){
		this.data = x;
		this.next = null;
	}
}

public class CircularSinglyLinkedLIstTraverse {

	public static void main(String[] args) {
		Node17 head = new Node17(05);
		head.next = new Node17(10);
		head.next.next = new Node17(20);
		head.next.next.next = new Node17(30);
		head.next.next.next.next = head;
		
		traverse(head);
	}

	private static void traverse(Node17 head) {
		if(head == null) return;
		Node17 curr = head;
		
		do {
			System.out.print(curr.data+",");
			curr = curr.next;
		}while(curr != head);
	}

}
