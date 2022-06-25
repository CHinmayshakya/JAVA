import java.io.*;
import java.util.*;;

public class f2 {
    public static void main(String[] args) throws IOException{
        FileInputStream f = new FileInputStream("D:\\Codes\\Java\\practice\\FileHandling\\files\\f1.txt");
        File fe = new File("D:\\Codes\\Java\\practice\\FileHandling\\files\\f1.txt"); 
        Scanner sc = new Scanner(fe);
        try {
            System.out.println(f.read());
            System.out.println(sc.next());
            System.out.println(sc.nextLine());
        }
        finally {
            f.close();
            sc.close();
        }
    }
}
