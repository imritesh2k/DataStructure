package doublyLinkedLists;

public class DoublyLinkedLists {

	private Node head;
	private Node tail;
	private int size;
	
	public void addToFront(int val) {
		Node node = new Node(val);
		node.setNext(head);
		if(head == null) { // If we are adding to empty list
			tail = node;
		}else { // If not to empty list
			head.setPrevious(node);
		}
		head = node;
		size++;
	}
	
	public void addToEnd(int val) {
		Node node = new Node(val);
		if(tail==null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	public void insertAtMiddle(int n, int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			int pos = 1;
			Node current = head;
			while(current != null) {
				if(pos == n) {
					break;
				}
				current = current.getNext();
				pos++;
			}
			newNode.setPrevious(current);
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			size++;
		}
	}
	
	public Node removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		Node removeNode = head;
		head = head.getNext();
		head.setPrevious(null);
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	public Node removeFromLast() {
		if(isEmpty()) {
			return null;
		}
		Node removeLastNode = tail;
		tail = tail.getPrevious();
		tail.setNext(null);
		removeLastNode.setPrevious(null);
		return removeLastNode;
	}
	
	public void printList() {
		Node current = head;
		System.out.print("Head -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
	
	/*
	 * Not Working
	 * 
	 * public void printMiddle() { Node ptr1 = head; Node ptr2 = head;
	 * 
	 * while(ptr1 != null && ptr2 != null) { ptr2.getNext().getNext();
	 * ptr1.getNext(); } System.out.println(ptr1);
	 * 
	 * }
	 */
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
}
