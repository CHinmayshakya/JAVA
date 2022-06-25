class above extends Exception {
    above(String s) {
        super(s);
    }
}

public class user {
    public static void main(String[] args) {
        try {
        double i = 0;
        while (true) {
            if (i > 100) {
                above a = new above("Greater then 100");
                throw(a);
            }
            System.out.println(i + "\n");
            i = i + (0.1);
        }
    }
    catch (above e) {
        System.out.println(e);
    }
    }
}
