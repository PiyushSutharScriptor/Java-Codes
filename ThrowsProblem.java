class NegativeException extends Exception{
    NegativeException(String message){
        super(message);
    }
}

public class ThrowsProblem {

    //throws : 
    public static float divide(int a, int b) throws ArithmeticException {
        float result = a/b;
        return result;
    }

    //throw : 
    public static double area(float r) throws NegativeException{
        if(r<0){
            throw new NegativeException("Entered Negative Radius!!");
        }
        else{
            double res = Math.PI*r*r;
            return res;
        }
    }

    public static void main(String[] args) {
        //case : 1
        try{
            System.out.println(divide(6,0));
        }
        catch(Exception e){
            System.out.println("Exception Occurred");
        }

        System.out.println();

        //case : 2
        try{
            double areaRes = area(-85);
            System.out.println(areaRes);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

    }
}
    