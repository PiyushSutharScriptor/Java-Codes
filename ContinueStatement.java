public class ContinueStatement {
    public static void main(String[] args) {

        System.out.println("For Loop(Continue) : ");
        for(int i=1 ; i<=5 ; i++){
            if(i==3){
                System.out.println(i + " : Continue Here");
                continue;
            }
            System.out.println(i + " : No Continue");
        }

        System.out.println();

        System.out.println("While Loop(Continue) : ");
        int n=1;
        while(n<=5){
            if(n==3){
                System.out.println(n + " : Continue Here");
                n++;    
                continue;
            }
            System.out.println(n + " : No Continue");
            n++;
        }

        System.out.println();

        System.out.println("Do While Loop(Continue)");
        int k=1 ; 
        do{
            if(k==3){
                System.out.println(k + " : Continue Here");
                k++;
            }
            System.out.println(k + " : No Continue");
            k++;
        }while(k<=5);
    }
}

