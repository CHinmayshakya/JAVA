import java.util.Scanner;

interface abc{
    void get_data();
    void display_data();
    void calculate_data();
}

abstract class employee implements abc{
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
    public void calculate_data(){
        tot = hra + da;
    }
}

class dispEmp extends employee{
    public void display_data(){
        System.out.println(emp + " " + name + " " + hra + " " + da + " " + age + " " + address + " " + tot);
    }
}

class q2{
    public static void main(String[] args) {
        dispEmp e = new dispEmp();
        System.out.println("employee ------------------------");
        e.get_data();
        e.calculate_data();
        e.display_data();
    }
}
