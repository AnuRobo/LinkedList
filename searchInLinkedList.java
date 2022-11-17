package dsa;

class Node9{
	int data;
	// self referencing structure
	Node9 next;
	Node9(int x){
		this.data = x;
		this.next = null;
	}
}

public class searchInLinkedList {

	public static void main(String[] args) {
		Node9 head = null;
		head = insertEnd(head, 05);
		head = insertEnd(head, 10);
		head = insertEnd(head, 20);
		head = insertEnd(head, 30);
		head = insertEnd(head, 40);
		
		printList(head);
		System.out.println("");
		System.out.println(searchList(head, 40)>0?"Found at "+searchList(head, 40): "Data not found");
		System.out.println(searchListRecu(head, 40)>0?"Found at "+searchListRecu(head, 40): "Data not found");
//		searchListRecu(head, 40);
	}

	private static int searchListRecu(Node9 head, int i) {
		if(head == null) return -1;
		
		if(head.data == i) {
			return 1;
		}else {
			int res = searchListRecu(head.next, i);
			if(res == -1) return -1;
			else return (res+1);
		}
	}

	private static int searchList(Node9 head, int i) {
		int pos = 1;
//		while(head.data != i) {
//			head = head.next;
//			j++;
//		}
//		System.out.println(i+" found at position "+j);
		
		while(head != null) {
			if(head.data == i) {
//				System.out.println(i+" found at position "+j);
				return pos;
			}else {
				pos++;
				head = head.next;
			}
		}
		
		return -1;
	}

	private static void printList(Node9 head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data+" ");
		printList(head.next);
	}

	private static Node9 insertEnd(Node9 head, int i) {
		Node9 temp = new Node9(i);
		
		if(head == null) {
			return temp;
		}
		
		Node9 curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

}
