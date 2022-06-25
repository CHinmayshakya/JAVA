public class company {
    int balance = 0;
    boolean status = false;

    synchronized public void deposit(int balance) throws Exception{
        if (status) {
            wait();
        }
        this.balance += balance;
        System.out.println("Balance Deposited = " + balance);
        status = true;
        notify();
    }
    synchronized public void withdraw(int w) throws Exception{
        if (!status) {
            wait();
        }
        this.balance -= w;
        System.out.println("                        " + w + " Amount withdrawn " + "\n" + "                        " + "New Balance = " + balance);
        status = false;
        notify();
    }
}
