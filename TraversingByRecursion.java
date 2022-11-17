package dsa;

class Node2{
	int data;
	Node2 next;
	Node2(int x){
		this.data = x;
		this.next = null;
	}
}

public class TraversingByRecursion {

	public static void main(String[] args) {
		Node2 head = new Node2(10);
		head.next = new Node2(20);
		head.next.next = new Node2(30);
		head.next.next.next = new Node2(40);
		
		printListRec(head);
	}
	
	private static void printListRec(Node2 head) {
//		Node1 curr = head;
		
		if(head == null) {
//			System.out.print(head.data+" ");
			return ;
		}
		System.out.print(head.data+" ");
		printListRec(head.next);
	}

}
