public class bank {
    public static void main(String[] args) {
        company comp = new company();
        deposit depo = new deposit(comp);
        withdraw with = new  withdraw(comp);
        System.out.println("------------Main Thread Start------------" + "\n" + "\n");
        depo.start();
        with.start();
    }
}
