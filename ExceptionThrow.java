import java.util.Scanner;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class ExceptionThrow{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        input.close();

        if (n<18){
            try{
                // Options : 
                throw new MyException("Invalid Number");
                // throw new ArithmeticException("Arithmetic Exception");
            }
            catch(Exception e){
                System.out.println(e); //Exception object (Java automatically calls
                                            //the toString() method when we print e

                System.out.println(e.toString()); 
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Valid Number");
        }

    }
}