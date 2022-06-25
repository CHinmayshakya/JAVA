import java.util.*;
class q3{
	public static void main(String []k){
		int first_no,second_no;
		Scanner scan_int = new Scanner(System.in);
		System.out.println("Enter first no = ");
		first_no = scan_int.nextInt();
		System.out.println("Enter second no = ");
		second_no = scan_int.nextInt();
		int sum1 = 0,sum2 = 0;
		for(int i = 1;i <= first_no;i++){
			if(first_no % i == 0){
				sum1 = sum1 + i;
			}
		}
		for(int i = 1;i <= second_no;i++){
			if(second_no % i == 0){
				sum2 = sum2 + i;
			}
		}
		if((sum1 / first_no) == (sum2 / second_no)){
			System.out.println("friendly pair");
		}
		else{
			System.out.println("not friendly pair");
		}
	}
}