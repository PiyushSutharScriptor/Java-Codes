import java.util.Scanner;
public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Count Of Even Or Odd Numbers : ");
        int n = input.nextInt();

        int EvenSum=0;

        for(int i=0 ; i<=2*n ; i++){
            if(i%2==0){
                EvenSum += i;
            }
        }
        System.out.println("Sum of " + n + " Even Numbers is : " + EvenSum);

        int OddSum = 0;
        for(int i=0 ; i<=2*n ; i++){
            if(i%2!=0){
                OddSum += i;
            }
        }
        System.out.println("Sum of " + n + " Odd Numbers is : " + OddSum);

    }
}
