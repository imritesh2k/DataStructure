package stack;

public class Main {

	public static void main(String[] args) {
		StackLinkList stack = new StackLinkList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.print();
		
		System.out.println();
		stack.pop();
		
		System.out.println();
		stack.print();
		
		stack.push(60);
		
		System.out.println();
		stack.print();
		
		System.out.println();
		stack.pop();
		stack.pop();
		
		System.out.println();
		stack.print();
		
		stack.push(70);
		
		System.out.println();
		stack.print();
	}

}
