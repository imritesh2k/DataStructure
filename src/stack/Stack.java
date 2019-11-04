package stack;

public class Stack {
	private int[] stack;
	private int top;
	
	public Stack(int capacity) {
		stack = new int[capacity];
	}
	
	public void push(int val) {
		if(top == stack.length) {
			//Need to resize the array as stack is full
			System.out.println("Stack get full so increasing the size of stack by double of stack size");
			int[] newArray = new int[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
		}
		stack[top++] = val;
	}

}
