import java.util.*;

class queue1 {
	public static void main(String []k) {
		struct_queue q1 = new struct_queue();
		q1.start(5);
		q1.enqueue(5);
		q1.enqueue(4);
		q1.enqueue(3);
		q1.enqueue(2);
		q1.enqueue(1);
		q1.display();
		q1.dequeue();
		q1.display();
	}
}

class struct_queue{
	int size;
	int f;
	int r;
	int arr[];
	void start(int size){
		this.size = size;
		f = r = -1;
		arr = new int[size];
	}
	boolean isFull(){
		if (r == size - 1){
			return true;
		}
		else {
			return false;
		}
	}
	boolean isEmpty(){
		if (f == r) {
			return true;
		}
		else {
			return false;
		}
	}
	void enqueue(int val){
		if (isFull()){
			System.out.println("Queue is full");
		}
		else {
			r++;
			arr[r] = val;
		}
	}
	void dequeue(){
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			f++;
			System.out.println("Dequeued = "+arr[f]);
		}
	}
	void display(){
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for (int temp = f + 1;temp <= r;temp++) {
				System.out.println(arr[temp]);
			}
		}
	}
}
