import java.io.*;

public class f1 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("D:\\Codes\\Java\\practice\\FileHandling\\files\\f1.txt");
        try {
            int len = f1.available();
            int symbol = 0,alphabet = 0,number = 0;
            for (int i = 1;i <= len;i++) {
                int str = f1.read();
                if(((str >= 65) && (str <= 90)) || ((str >= 97) && (str <= 122))) { 
                    alphabet++;
                    //System.out.println("Alphabet = " + (char)str);
                }
                else if((str >= 48) && (str <= 57)) {
                    number++;
                    //System.out.println("Number = " + (char)str);
                }
                else if((str != 13) && (str != 10)){
                    symbol++;
                    //System.out.println("Symbol = " + (char)str);
                }
            }
            System.out.println(alphabet + " " + number + " " + symbol);
        }
        finally {
            f1.close();
        }
    }

}
