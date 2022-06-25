public class consumer extends Thread {

    company comp;

    consumer(company comp){
        this.comp = comp;
    }
    
    public void run(){
        while (true) {
            try {
                this.comp.comsumer();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
