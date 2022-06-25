import java.util.*;

class capital extends Exception {
	capital (String S) {
		super(S);
	}
}

class number extends Exception {
	number (String S) {
		super(S);
	}
}

class e1 {
	public static void main (String []k) {
		Scanner scr1 = new Scanner(System.in);
		Scanner scr2 = new Scanner(System.in);
		String str1 = scr1.nextLine();
		int n = scr2.nextInt();
		try {
			if (!(((str1.charAt(0)) >= 65) && ((str1.charAt(0)) <= 90))) {
				capital c1 = new capital("First letter need to be capital");
				throw(c1);
			}
			else {
				System.out.println(str1);
			}
			if (n > 9) {
				number n1 = new number("Number need to be less then 10");
				throw(n1);
			}
			else {
				System.out.println(n);
			}
		}
		catch(capital a1) {
			System.out.println(a1);
		}
		catch(number a2) {
			System.out.println(a2);
		}
	}
}