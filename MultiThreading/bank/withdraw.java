import java.util.Scanner;

public class withdraw extends Thread{
    company comp;

    withdraw(company comp) {
        this.comp = comp;
    }
    public void run(){
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                this.comp.withdraw(n);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(3000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}