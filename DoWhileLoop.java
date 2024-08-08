import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting Number : ");
        int start = input.nextInt();
        
        System.out.print("Enter Ending Number : ");
        int end = input.nextInt();

        System.out.println();

        do{
            System.out.println(start);
            start++;
        }while(start<=end);
    }
}
