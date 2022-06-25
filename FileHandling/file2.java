import java.io.*;
class file2{
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("D:\\Codes\\Java\\practice\\FileHandling\\files\\f1.txt");
        BufferedInputStream b1 = new BufferedInputStream(f1);
		int len = b1.available();
        int i = 1;
        while (i <= len) {
            char ch = (char)b1.read();
            System.out.print(ch);
            i++;
        }
        b1.close();
    }
}