import java.util.*;
import java.lang.*;
class member{
    String name,address;
    int age;
    double phone_no,salary;
    void printsalary(){
        System.out.println("Salary = " + salary);
    }
}

class employee extends member{
    String specilization ,department;
    employee(String n,String a,int b,double no,double sa,String spec,String dep){
        name = n;
        address = a;
        age = b;
        phone_no = no;
        salary = sa;
        specilization = spec;
        department = dep;
    }
    void print(){
        System.out.println("Name = " + name + "Age = " + age + "Specilization = " + specilization + "Department = " + department + "Phone No = " + phone_no + "Addess = " + address);
        printsalary();
    }
}

class manager extends member{
    String specilization ,department;
    manager(String n,String a,int b,double no,double sa,String spec,String dep){
        name = n;
        address = a;
        age = b;
        phone_no = no;
        salary = sa;
        specilization = spec;
        department = dep;
    }
    void print(){
        System.out.println("Name = " + name + "Age = " + age + "Specilization = " + specilization + "Department = " + department + "Phone No = " + phone_no + "Addess = " + address);
        printsalary();
    }
}

public class p2 {
    public static void main(String[] args) {
        employee emp[] = new employee[10];
        manager man[] = new manager[10];
        System.out.println("-------ENTER DATA FOR EMPLOYEES-------");
        for (int i = 0; i < 1; i++) {
            System.out.println("--------------------------------------");
            String n,a,spec,dep;
            int b;
            double no,sa;
            Scanner scan_string = new Scanner(System.in);
            Scanner scan_int = new Scanner(System.in);
            Scanner scan_double = new Scanner(System.in);
            System.out.println("Name = ");
            n = scan_string.nextLine();
            System.out.println("address = ");
            a = scan_string.nextLine();
            System.out.println("Age = ");
            b = scan_string.nextInt();
            System.out.println("Phone no = ");
            no = scan_string.nextDouble();
            System.out.println("Salary = ");
            sa = scan_string.nextDouble();
            System.out.println("Specilization = ");
            spec = scan_string.nextLine();
            System.out.println("Department = ");
            dep = scan_string.nextLine();
            emp[i] = new employee(n, a, b, no, sa, spec, dep);
            System.out.println("--------------------------------------");
        }
        System.out.println("-------DATA FOR EMPLOYEES-------");
        for (int i = 0; i < 1; i++) {
            System.out.println("--------------------------------------");
            emp[i].print();
            System.out.println("--------------------------------------");
        }

        System.out.println("-------ENTER DATA FOR MANAGERS-------");
        for (int i = 0; i < 1; i++) {
            System.out.println("--------------------------------------");
            String n,a,spec,dep;
            int b;
            double no,sa;
            Scanner scan_string = new Scanner(System.in);
            Scanner scan_int = new Scanner(System.in);
            Scanner scan_double = new Scanner(System.in);
            System.out.println("Name = ");
            n = scan_string.nextLine();
            System.out.println("address = ");
            a = scan_string.nextLine();
            System.out.println("Age = ");
            b = scan_string.nextInt();
            System.out.println("Phone no = ");
            no = scan_string.nextDouble();
            System.out.println("Salary = ");
            sa = scan_string.nextDouble();
            System.out.println("Specilization = ");
            spec = scan_string.nextLine();
            System.out.println("Department = ");
            dep = scan_string.nextLine();
            man[i] = new manager(n, a, b, no, sa, spec, dep);
            System.out.println("--------------------------------------");
        }
        System.out.println("-------DATA FOR MANAGERS-------");
        for (int i = 0; i < 1; i++) {
            System.out.println("--------------------------------------");
            man[i].print();
            System.out.println("--------------------------------------");
        }
    }
}
