import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting Number : ");
        int start = input.nextInt();
        
        System.out.print("Enter Ending Number : ");
        int end = input.nextInt();

        System.out.println();

        while(start<=end){
            System.out.println(start);
            start++;
        }
    }
}
