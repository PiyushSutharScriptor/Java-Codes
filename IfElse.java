import java.util.Scanner;
public class IfElse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Eligible For Driving Licence.");
        }
        else{
            System.out.println("Not Eligible For Driving Licence.");
        }
    }
}