import java.util.Scanner;
public class AdditionOfNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter Second Number : ");
        double num2 = input.nextDouble();
        System.out.println("The Addition Of Numbers Is : " + (num1+num2));
    }
}
