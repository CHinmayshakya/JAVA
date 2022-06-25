import java.util.*;

abstract class Tempreature {
    double temp;

    void setTempData(double x){}

    abstract void changeTemp();
}

class Fehrenheit extends Tempreature {
    double ctemp;

    void setTempData(double t) {
        temp = t;
        changeTemp();
    }

    void changeTemp() {
        ctemp = (5 / 9.0) * (temp - 32);
        System.out.println("Tempreature in Celsius = " + ctemp);
    }
}

class Celsius extends Tempreature {
    double ftemp;

    void setTempData(double t) {
        temp = t;
        changeTemp();
    }

    void changeTemp() {
        ftemp = ((9 / 5.0) * temp) + 32;
        System.out.println("Tempreature in Fehrenheit = " + ftemp);
    }
}

class q14 {
    public static void main(String[] args) {
        Fehrenheit f = new Fehrenheit();
        Celsius c = new Celsius();
        System.out.println("1. Celsius to Fehrenheit\n2. Fehrenheit to celsius\n3. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter celsius value= ");
                double cel = sc.nextDouble();
                c.setTempData(cel);
                break;
            case 2:
                System.out.println("Enter Fehrenheit value= ");
                double feh = sc.nextDouble();
                f.setTempData(feh);
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
