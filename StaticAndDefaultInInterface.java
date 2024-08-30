interface Bank{
    public static final int balance = 20000;
    public String type = "Saving";

    //Abstract Methods : 
    public abstract void balance();
    public void accountType();

    //Default Method : 
    default void greet(){
        System.out.println("Welcome To Java(Default Method)");
    }

    //Static Method : 
    public static void greet2(){
        System.out.println("Welcome to Java(Static Method)");
    }
}

class User implements Bank{
    public void balance(){
        System.out.println("Balance : " + balance);
    }

    public void accountType(){
        System.out.println("Account Type : " + type);
    }
}

public class StaticAndDefaultInInterface {
    public static void main(String[] args) {

        //Object Creation (Child Class)
        User u1 = new User();

        //Abstract Method
        u1.balance();
        u1.accountType();

        //Default Method : 
        u1.greet();

        //Static Method : 
        Bank.greet2();

    }
}
