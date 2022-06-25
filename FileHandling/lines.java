import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class lines {
    public static void main(String[] args) throws IOException{
        File f = new File("D:\\Codes\\Java\\practice\\FileHandling\\files\\f1.txt");
        Scanner sc = new Scanner(f);
        int count = 0;
        try {
            while (sc.hasNext()) {
                sc.nextLine();
                count++;
            }
            System.out.print(count);
        }
        finally {
            sc.close();
        }
    }
}
