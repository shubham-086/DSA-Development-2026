public class StackExample {
	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		stack.push(30);
		stack.push(20);
		stack.push(40);
		stack.push(10);
		stack.push(50);

		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}

class MyStack {
	int[] stack;
	int top = -1;

	MyStack(int size) {
		stack = new int[size];
	}

	void push(int val) {
		if (top == stack.length - 1) {
			System.out.println("Stack Overflow!");
			return;
		}
		stack[++top] = val;
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}

		return stack[top--];
	}

	int peek() {
		if (top == -1) {
			return -1;
		}
		return stack[top];
	}
}