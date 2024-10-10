import java.util.Scanner;
public class BasicError{
    public static void main(String[] args){
        //Syntax Error : 
        int a = 10;
        // System.out.println(a+b);
        // x = 20;

        //Logical Error : 
        /*
         Even numbers are divisible by 2
         But if we divide with 3 then it 
         is a logical error
        */
        for(int i=1 ; i<5 ; i++){
            if(i%3==0){
                System.out.println(i + " : Even Numbers");
            }
            else{
                System.out.println(i + " : Odd Number");
            }
        }

        //Runtime Error : 
        //Ex : Choosing Wrong Input By User : 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Only Number : ");
        double num = input.nextDouble();
        System.out.println(num);
        input.close();

    }
}