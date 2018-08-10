package ds;

class Node {
	Node next;//pointer
	int value;

	public Node(int value) {
		this.value = value;
	}
}


public class LinkedList {
	/*
	 * LinkedList VS Array Easy to insert and delete element, just need to move the
	 * pointer size is growable has extra memory since it has extra pointer.
	 * 
	 * Array fetching the value of certain index of value is easy Delete and insert
	 * is more complex(time and memory)
	 */
	
	Node head;

	public void prepend(int i) {
		Node newHead = new Node(i);
		newHead.next = head;
		head = newHead;	
	}

	public void delete(int i) {
		if(head == null) return;
		if(head.value == i) {
			head = head.next;
			return;
		}		
		Node current = head;
		while(current.next != null) {
			if(current.next.value == i) {
				current.next = current.next.next;
				return;
			}
		}		
	}

	public void append(int i) {
		if(head == null) {
			head = new Node(i);
		}
		Node current = head;	
		while(current.next != null) {
			current = current.next;			
		}		
		current.next = new Node(i);
		
	}
}
