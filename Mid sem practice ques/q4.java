import java.util.*;
import java.lang.*;
class q4{
	public static void main(String []k){
		int n;
		Scanner scan_int = new Scanner(System.in);
		System.out.println("enter no = ");
		n = scan_int.nextInt();
		String string_number = Integer.toString(n);
		String str1 = "";
		for(int i = 0 ; i < string_number.length() ; i++)
		{
			if(string_number.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + string_number.charAt(i);	
		}
		for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
	}
}