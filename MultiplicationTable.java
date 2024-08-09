import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Table Number : ");
        int n = input.nextInt();

        System.out.println();

        for(int i=1 ; i<=15 ; i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }
}
