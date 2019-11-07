package stack;

public class StackLinkList {
	
	private Node head;
	
	public void push(int val) {
		Node n = new Node(val);
		n.setNext(head);
		head = n;
	}
	
	public void print() {
		Node current = head;
		System.out.println("Head");
		while(current!=null) {
			//System.out.print(" => ");
			System.out.println(current);
			current = current.getNext();
		}
	}
	
	public void pop() {
		System.out.println(head);
		Node popNode = head;
		head = head.getNext();
		popNode.setNext(null);
		
	}


}
