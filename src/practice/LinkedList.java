package practice;

class Node{
	Node next;
	int value;
	
	Node(int value){
		this.value = value;
	}
}

public class LinkedList {
	Node head;	
	public void delete(int value) {
		if(head == null) return;
		if(head.value == value) {
			head=head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.value == value) {
				current.next = current.next.next;
				return;
			}
		}
	}

	public void append(int value) {
		if(head == null) head = new Node(value);
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		
		current = new Node(value);
	}
	
	public void preappend(int value) {
		Node newHead = new Node(value);
		newHead.next = head;
		head=newHead;
	}
	
}
