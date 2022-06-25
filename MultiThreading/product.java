public class product extends Thread {

    company comp;

    product(company comp){
        this.comp = comp;
    }
    
    public void run(){
        int i = 1;
        while (true) {
            try {
                comp.product(i);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            i++;
        }
    }
}
