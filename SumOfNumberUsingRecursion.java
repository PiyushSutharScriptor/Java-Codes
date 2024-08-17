import java.util.Scanner;

public class SumOfNumberUsingRecursion {
    int RecursionSum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+RecursionSum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The nth Natural Number : ");
        int n = input.nextInt();
        SumOfNumberUsingRecursion s1 = new SumOfNumberUsingRecursion();
        int result = s1.RecursionSum(n);
        System.out.println("Sum Of " + n + " Natural Numbers : " + result);
        input.close();
    }
}
