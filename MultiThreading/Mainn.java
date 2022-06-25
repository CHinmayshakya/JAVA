public class Mainn {
    public static void main(String[] args) {
        company comp = new company();
        product prod = new product(comp);
        consumer cons = new consumer(comp);
        System.out.println("----------PROGRAM STARTED---------");
        prod.start();
        cons.start();
    }
}
