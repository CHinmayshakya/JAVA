class mythread implements Runnable{
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread 1 i value is "+i);
            try {
                //Thread t = new Thread();
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        mythread thr = new mythread();
        Thread thread = new Thread(thr);
        myanotherThread th = new myanotherThread();
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        thread.start();
        th.start();
    }
}
