import java.io.*;
import java.util.Scanner;

class palin {
	int count = 0;

	void check(String str) {
		String reverseStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			count++;
		}
	}

	public static void main(String[] args) throws IOException {
		palin p =new palin();
		Scanner sc = new Scanner(new File("C:\\Users\\Chinmay shakya\\Desktop\\sssss.txt"));
		while (sc.hasNext()) {
			String s = sc.next();
			p.check(s);
		}
		System.out.println(p.count);
	}
}