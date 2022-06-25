public class myanotherThread extends Thread {
    public void run(){
        for (int i = 10; i >= 1; i--) {
            System.out.println("            Thread 2 j value is "+i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    public static void main(String[] args) {
        myanotherThread th = new myanotherThread();
        th.start();
    }
}
