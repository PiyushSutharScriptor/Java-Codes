public class IncrementDecrement {
    public static void main(String[] args){
        int a=5;
        int b=10;
        //PreIncrement : 
        System.out.println("PreIncrement(++a) : " + ++a);
        //PostIncrement : 
        System.out.println("PreIncrement(b++) : " + b++);

        int c=25;
        int d=40;
        //PreDecrement : 
        System.out.println("PreDecrement(--c) : " + --c);
        //PostDecrement : 
        System.out.println("PostDecrement(d--) : " + d--);

        //Character Increment And Decrement : 
        char ch='a';
        char ch2='c';
        System.out.println("Character PreIncrement : " + ++ch);
        System.out.println("Character PreDecrement : " + --ch2);
    }
}
