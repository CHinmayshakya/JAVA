class MultByZero extends Exception {
    MultByZero(String s) {
        super(s);
    }
}

class q5 {
    public static void main(String[] args) {
        int a = 20;
        try {
            a = a * 20;
            //a = a * 0;
            if (a == 0) {
                MultByZero m1 = new MultByZero("Zero Exception Encounter");
                throw (m1);
            }
        } 
        catch (MultByZero e) {
            System.out.println(e);
        }
        finally {
            System.out.println("File ended");
        }
    }
}
