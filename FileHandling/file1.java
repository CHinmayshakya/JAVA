import java.io.*;

class file1{
    public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("D:\\Codes\\Java\\practice\\FileHandling\\files\\f1.txt");
		try {
			int len = f1.available();
			int i = 1;
			while (i <= len / 2) {
				char ch = (char)f1.read();
				System.out.print(ch);
				i++;
			}
			f1.skip(3);
			i = i + 3;
			while (i <= len) {
				char ch = (char)f1.read();
				System.out.print(ch);
				i++;
			}
		}
		finally {
			f1.close();
		}
    }
}