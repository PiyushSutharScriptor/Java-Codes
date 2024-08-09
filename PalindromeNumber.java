import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number To Check Palindrome : ");
        int num = input.nextInt();

        int originalNumber = num;

        int reverseNumber = 0;
        while(num!=0){
            int digit = num%10;
            reverseNumber = reverseNumber*10+digit;
            num/=10;
        }

        if(originalNumber==reverseNumber){
            System.out.println(reverseNumber + " is a Palindrome Number");
        }
        else{
            System.out.println(reverseNumber + " is not a Palindrome Number");
        }

    }
}
