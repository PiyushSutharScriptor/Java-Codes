import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int realNumber;

    //Generating Random Number : 
    GuessGame(){
        Random random = new Random();
        this.realNumber = random.nextInt(101);
    }
    
    //User Input and Conditions : 
    public void userInput(){
        Scanner input = new Scanner(System.in);
        int count = 1;
        do{
            System.out.print("Guess The Number : ");
            int userNumber = input.nextInt();
            if(userNumber>realNumber){
                System.out.println(userNumber + " is greater");
                count++;
            }
            else if(userNumber<realNumber){
                System.out.println(userNumber + " is smaller");
                count++;
            }
            else{
                System.out.println("The Guess Number Is Correct : " + realNumber);
                System.out.println("Total Number Of Guess : " + count);
                break;
            }
        }while(true) ;

        input.close();
    }

    //main method
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.userInput();
    }
}
