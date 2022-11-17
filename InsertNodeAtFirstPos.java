package dsa;

class Node3{
	int data;
	Node3 next;
	Node3(int x){
		this.data = x;
		this.next = null;
	}
}

public class InsertNodeAtFirstPos {

	public static void main(String[] args) {
		Node3 head = new Node3(10);
		head.next  = new Node3(20);
		head.next.next = new Node3(30);
		
		atBegin(head);
	}

	private static void atBegin(Node3 head) {
		Node3 begin = new Node3(5);
		begin.next = head;
		traverse(begin);
	}

	private static void traverse(Node3 begin) {
		if(begin == null) {
			return ;
		}
		System.out.print(begin.data+" ");
		traverse(begin.next);
	}
	
	

}
