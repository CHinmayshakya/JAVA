import java.util.*;

abstract class bank{
    int ifcode;
    String name,branch,addr;
    abstract void get_info();
}

abstract class customer extends bank{
    int bal;
    String cname,caddr;
    double contact;
    abstract void cdata();
}

class calculation extends customer{
    public void get_info(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name,branch,address,ifscode");
        name = sc.nextLine();
        branch = sc.nextLine();
        addr = sc.nextLine();
        ifcode = sc1.nextInt();
    }
    public void cdata(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter name,address,balance,contact");
        name = sc.nextLine();
        addr = sc.nextLine();
        bal = sc1.nextInt();
    }
    void deposit(){
        System.out.println("Enter amount to deposit = ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        bal = bal + temp;
    }
    void withdraw(){
        System.out.println("Enter amount to withdraw = ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp > bal){
            bal = bal - temp;
            System.out.println("transaction successful");
        }
        else{
            System.out.println("not enough balance");
        }
    }
    void display(){
        System.out.println("name =" + name + " branch = "+branch+"a ddress = "+addr+" IFScode = "+ifcode);
        System.out.println("name =" + cname + " address = "+addr+" balance = "+bal);

    }
    public static void main(String[] args) {
        calculation cal = new calculation();
        cal.get_info();
        cal.cdata();
        System.out.println("1. deposit 2. withdraw 3. exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                cal.deposit();
                break;
            case 2:
                cal.withdraw();
                break;
            case 3:
            break;
        }
        cal.display();
    }
}