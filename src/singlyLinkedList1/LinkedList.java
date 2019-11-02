package singlyLinkedList1;

public class LinkedList {

	private Node head;
	private int size;
	
	public void addToFront(int val) {
		Node node = new Node(val);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void insertAtLast(int val) {
		Node lastNode = new Node(val);
		Node current = head;
		Node storeNext = null;
		while(current!=null) {
			storeNext = current;
			current = current.getNext();
		}
		storeNext.setNext(lastNode);
		size++;
	}
	
	public void insertAtMiddle(int n, int val) {
		if(head == null) {
			head = new Node(val);
		}else {
			Node newNode = new Node(val);
			int pos = 1;
			Node current = head;
			while(current != null) {
				if(pos == n) {
					break;
				}
				current = current.getNext();
				pos++;
			}
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
		size--;
		removeNode.setNext(null);
		return removeNode;
		
	}
	
	public void printList() {
		Node current = head;
		System.out.print("Head -> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" -> ");
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
