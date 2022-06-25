import java.io.*;

class write {
	public static void main(String []k) throws IOException {
		FileOutputStream f1 = new FileOutputStream("D:\\Codes\\Java\\practice\\FileHandling\\files\\f2.txt");
		Byte by = 1;
		while ((int)by != -1) {
			by = (byte)System.in.read(); 
			f1.write(by);
		}
		f1.close();
	}
}