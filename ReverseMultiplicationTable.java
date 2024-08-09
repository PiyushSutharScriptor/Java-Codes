import java.util.Scanner;
public class ReverseMultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Table Number : ");
        int n = input.nextInt();

        System.out.println();

        for(int i=15 ; i>0 ; i--){
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }
}
