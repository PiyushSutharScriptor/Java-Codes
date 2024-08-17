import java.util.Scanner;
public class FibonacciSeries {
    void Fibonacci(int n){
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series : " + first + "," + second);
        for(int i=3 ; i<=n ; i++){
            int next = first+second;
            System.out.print(","+next);
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Terms : ");
        int n = input.nextInt();
        FibonacciSeries s1 = new FibonacciSeries();
        s1.Fibonacci(n);
        input.close();
    }
}
