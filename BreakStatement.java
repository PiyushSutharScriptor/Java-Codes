public class BreakStatement {
    public static void main(String[] args) {

        System.out.println("For Loop(break) : ");
        for(int i=1 ; i<=5 ; i++){
            if(i==3){
                System.out.println(i + " : Break Here");
                break;
            }
            System.out.println(i + " : No Break");
        }

        System.out.println();

        System.out.println("While Loop(break) : ");
        int n=1;
        while(n<=5){
            if(n==3){
                System.out.println(n + " : Break Here");
                break;
            }
            System.out.println(n + " : No Break");
            n++;
        }

        System.out.println();

        System.out.println("Do While Loop(break) : ");
        int k=1;
        do{
            if(k==3){
                System.out.println(k + " : Break Here");
                break;
            }
            System.out.println(k + " : No Break");
            k++;
        }while(k<=5);


    }
}
