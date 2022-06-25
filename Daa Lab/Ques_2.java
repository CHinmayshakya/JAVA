import java.util.*;	
class Ques_2{
	static int count = 0;
	int binary_search(int arr[],int lower,int upper,int x){
		count++;
		if (lower <= upper){
			int mid = (lower + upper) / 2;
			if (arr[mid] == x){
				return mid;
			}
			else if (x < arr[mid]){
				return binary_search(arr,lower,(mid - 1),x);
			}
			else{
				return binary_search(arr,(mid + 1),upper,x);
			}
		}
		else{
			return -1;
		}
	}
	
	public static void main(String []k){
		int[] array = new int[100];
		int n,a;
		Ques_2 access = new Ques_2();
		Scanner scan_int = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Enter the size of array = ");
		n = scan_int.nextInt();
		System.out.println("--------------------------------------");
		System.out.println("Enter the elements of of array = ");
		for(int i = 0;i < n;i++){
			array[i] = scan_int.nextInt();
		}
		System.out.println("--------------------------------------");
		System.out.println("Enter the element to search = ");
		a = scan_int.nextInt();
		System.out.println("--------------------------------------");
		int index = access.binary_search(array,0,(n),a);
		if (index != -1){
			System.out.println("Number found at index "+index);
			System.out.println("--------------------------------------");
		}
		else{
			System.out.println("Number not found");
			System.out.println("--------------------------------------");
		}
		System.out.println("No of comparisons = "+Ques_2.count);
		System.out.println("--------------------------------------");
	}
}