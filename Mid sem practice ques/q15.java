import java.util.*;

interface calc{
    void display_volume();
}

class cone implements calc{
    public void display_volume(){
        System.out.println("-------Cone-------");
        Scanner scan_Double = new Scanner(System.in);
        System.out.println("Enter radius = ");
        double radius = scan_Double.nextDouble();
        System.out.println("Enter height = ");
        double height = scan_Double.nextDouble();
        double volume = 3.14159 * ((radius * radius) * (height / 3));
        System.out.println("Volume of cone = " + volume);
    }
}

class hemisphere implements calc{
    public void display_volume(){
        System.out.println("-------Hemisphere-------");
        Scanner scan_Double = new Scanner(System.in);
        System.out.println("Enter radius = ");
        double radius = scan_Double.nextDouble();
        double volume = (2 / 3.0) * (3.14159 * (radius * radius * radius));
        System.out.println("Volume of hemisphere = " + volume);
    }
}

class cylinder implements calc{
    public void display_volume(){
        System.out.println("-------Cylinder-------");
        Scanner scan_Double = new Scanner(System.in);
        System.out.println("Enter radius = ");
        double radius = scan_Double.nextDouble();
        System.out.println("Enter height = ");
        double height = scan_Double.nextDouble();
        double volume = 3.14159 * ((radius * radius) * height);
        System.out.println("Volume of cylinder = " + volume);
    }
}

class q15{
    public static void main(String[] args) {
        cone co = new cone();
        hemisphere hemi = new hemisphere();
        cylinder cy = new cylinder();
        co.display_volume();
        hemi.display_volume();
        cy.display_volume();
    }
}