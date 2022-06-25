class parent {
    private void print(){
        System.out.println("This is parent class");
    }
}

class child extends parent {
    void show(){
        System.out.println("This is child class");
    }
}

public class p1 {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        //p.print();
        c.show();
        //c.print();
    }
}
