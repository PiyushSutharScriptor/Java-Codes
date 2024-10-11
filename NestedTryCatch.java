import java.util.InputMismatchException;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Start");

        int a = 1000;
        int num = 0;
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter Number To Divide With 1000 : ");
            num = input.nextInt();

            try{
                System.out.println("Answer : " + a/num);
            }
            catch(ArithmeticException e){
                System.out.println("Inner Catch Block");
                System.out.println("ArithmeticException : " + e);
            }
        }
        catch(InputMismatchException e){
            System.out.println("Outer Catch Block");
            System.out.println("InputMismatchException : " + e);
        }
        catch(Exception e){
            System.out.println("Outer Catch Block");
            System.out.println("Other Exception : " + e);
        }

        input.close();

        System.out.println("End");

    }
}
