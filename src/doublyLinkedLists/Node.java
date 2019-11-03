package doublyLinkedLists;

public class Node {
	private int val;
	private Node next;
	private Node previous;
	
	public Node(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public String toString() {
		return "["+ val+"]";
	}
	
	

}
