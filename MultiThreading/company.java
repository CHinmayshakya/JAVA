public class company {
    int stock;
    boolean status = false;
    // if false produce
    // if true consume

    synchronized void product(int stock) throws Exception {
        if (status) {
            wait();
        }
        this.stock = stock;
        System.out.println("Product produced = " + this.stock);
        status = true;
        notify();
    }

    synchronized void comsumer() throws Exception {
        if (!status) {
            wait();
        }
        System.out.println("Product consumed = " + this.stock);
        status = false;
        notify();
    }

}
