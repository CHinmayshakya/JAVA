import java.util.*;

class stack {
	public static void main(String []k) {
		struct_stack s1 = new struct_stack();
		s1.start(3);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.display();
		s1.pop();
		s1.display();
	}
}

class struct_stack {
	int size;
	int top;
	int arr[];
	
	void start(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void push (int val) {
		if (isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			top++;
			arr[top] = val;
		}
	}
	
	void pop () {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Poped = "+arr[top]);
			top--;
		}
	}
	
	void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			for (int i = top;i >= 0;i--) {
				System.out.println(arr[i]);
			}
		}
	}
}
	