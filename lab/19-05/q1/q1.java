import java.util.Scanner;

interface abc{
    void get_data();
    void display_data();
    void calculate_data();
}

class bank implements abc{
    int ac_no,bal;
    double contact;
    String name,address;
    public void get_data(){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3= new Scanner(System.in);
        System.out.println("enter name , Account no,contact no, bal,address");
        name = s1.nextLine();
        ac_no = s2.nextInt();
        contact = s3.nextDouble();
        bal = s2.nextInt();
        address = s1.nextLine();
    }
    public void display_data(){
        System.out.println(ac_no + " " + name + " " + contact + " " + bal + " " + address);
    }
    public void calculate_data(){
        bal = bal * 10;
    }
}

class employee implements abc{
    int emp,age,hra,da,tot;
    String name,address;
    public void get_data(){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3= new Scanner(System.in);
        System.out.println("enter name , emp no,hra, da,age,address");
        name = s1.nextLine();
        emp = s2.nextInt();
        hra = s3.nextInt();
        da = s2.nextInt();
        age = s2.nextInt();
        address = s1.nextLine();
    }
    public void display_data(){
        System.out.println(emp + " " + name + " " + hra + " " + da + " " + age + " " + address + " " + tot);
    }
    public void calculate_data(){
        tot = hra + da;
    }
}

class q1{
    public static void main(String[] args) {
        bank b = new bank();
        employee e = new employee();
        b.get_data();
        b.calculate_data();
        b.display_data();
        System.out.println("employee ------------------------");
        e.get_data();
        e.calculate_data();
        e.display_data();
    }
}