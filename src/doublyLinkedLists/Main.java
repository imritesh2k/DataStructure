package doublyLinkedLists;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedLists list = new DoublyLinkedLists();
		
		
		list.addToFront(10);
		list.addToFront(20);
		list.addToFront(30);
		list.addToFront(40);
		list.addToFront(50);
		
		
		list.printList();
		System.out.println();
		
		/*
		 * list.addToEnd(100); list.printList(); System.out.println();
		 */
		
		/*
		 * list.insertAtMiddle(2, 25); list.printList(); System.out.println();
		 */
		
		/*
		 * list.removeFromFront(); list.printList(); System.out.println();
		 */
		
		list.removeFromLast();
		list.printList();
		System.out.println();
		

		

	}

}
