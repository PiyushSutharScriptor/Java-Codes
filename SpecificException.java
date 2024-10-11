
import java.util.InputMismatchException;
import java.util.Scanner;
public class SpecificException{
    public static void main(String[] args) {
        System.out.println("Start");

        int a = 500;
        int num = 0;

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter Number To Divide With 500 : ");
            num = input.nextInt();
            System.out.println("Answer : " + a/num);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide " + a + " by " + num);
            System.out.println("Arithmetic Exception : " + e);
        }
        catch(InputMismatchException e){
            System.out.println("Cannot Divide " + a + " by " + num);
            System.out.println("InputMismatchException Exception : " + e);
        }
        catch(Exception e){
            System.out.println("Other Exception Occured" + e);
        }

        System.out.println("End");

        input.close();
    }
}