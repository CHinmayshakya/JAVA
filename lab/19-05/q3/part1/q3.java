interface A{
    void disp1();
}

interface B extends A{
    void disp2();
}

class q3 implements B{
    public void disp1(){
        System.out.println("disp1");
    }

    public void disp2(){
        System.out.println("disp2");
    }

    public static void main(String[] args) {
        q3 abc = new q3();
        abc.disp1();
        abc.disp2();
    }
}
