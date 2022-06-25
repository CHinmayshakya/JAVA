class q4{
    public static void main(String[] args) {
        int array[] = {0,1,2,3,4};
        try {
            int tot = 25/array[1];//0 <--> 1
            System.out.println(tot);
            //System.out.println(array[9]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Encounter = " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out Of Bound Exception Encounter = " + e);
        }
        finally{
            System.out.println("File closed");
        }
    }
}
