import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args){
        System.out.println("Welcome To Rock,Paper,Scissor : ");
        System.out.println("0 : Rock");
        System.out.println("1 : Paper");
        System.out.println("2 : Scissor");

        int rounds = 0;
        int usercount = 0;
        int computercount = 0;
        while(rounds<6){

        
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter 0,1 or 2 : ");
        int uinput = s.nextInt();

        System.out.println();

        Random r = new Random();
        int cinput = r.nextInt(3);

        //Computer Input
        if(cinput==0){
            System.out.println("Computer Input : Rock");
        }
        else if(cinput==1){
            System.out.println("Computer Input : Paper");
        }
        else{
            System.out.println("Computer Input : Scissor");
        }

        //User Input
        if(uinput==0){
            System.out.println("User Input : Rock");
        }
        else if(uinput==1){
            System.out.println("User Input : Paper");
        }
        else{
            System.out.println("User Input : Scissor");
        }

        System.out.println("-----------------------");

        if(uinput==0 && cinput==0){
            System.out.println("Match Tie");
        }
        else if(uinput==1 && cinput==1){
            System.out.println("Match Tie");
        }
        else if(uinput==2 && cinput==2){
            System.out.println("Match Tie");
        }
        else if(uinput==0 && cinput==1){
            System.out.println("Computer Wins");
            computercount++;
        }
        else if(uinput==1 && cinput==2){
            System.out.println("Computer Wins");
            computercount++;
        }
        else if(uinput==0 && cinput==2){
            System.out.println("User Wins");
            usercount++;
        }
        else if(uinput==1 && cinput==0){
            System.out.println("User Wins");
            usercount++;
        }
        else if(uinput==2 && cinput==1){
            System.out.println("User Wins");
            usercount++;
        }
        else if(uinput==2 && cinput==0){
            System.out.println("Computer Wins");
            computercount++;
        }
        else{
            System.out.println("Invalid Input");
        }

        rounds++;
      }

      System.out.println();
      System.out.println();
      System.out.println("--------------------------------------");
      System.out.println("--------------------------------------");

      if(usercount<computercount){
        System.out.println(">>Winner Of 5 Matches is : Computer <<");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Score Board : ");
        System.out.println("------------------------------------");
        System.out.println("Computer Points : " + computercount);
        System.out.println("User Points : " + usercount);
        System.out.println("------------------------------------");
    }
    else if(usercount>computercount){
        System.out.println(">>Winner Of 5 Matches is : User <<");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Score Board : ");
        System.out.println("------------------------------------");
        System.out.println("User Points : " + usercount);
        System.out.println("Computer Points : " + computercount);
        System.out.println("------------------------------------");
    }
    else{
        System.out.println("Match Tie Between User And Computer");
    }

    }
}
