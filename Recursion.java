import java.util.Scanner;
public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    int factorial2(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();

        //Method : 1
        System.out.println("The Factorial of " + n + " is : " + (factorial(n)));

        //Method : 2
        Recursion f1 = new Recursion();
        int objResult = f1.factorial2(n);
        System.out.println("The Factorial of " + n + " is : " + objResult);

        input.close();
    }
}
