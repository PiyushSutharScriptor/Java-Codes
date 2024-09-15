interface Parent{
    void abstractMethod();
    abstract void abstractMethod2();
    public abstract void abstractMethod3();
    default void defaultMethod(){
        System.out.println("Default Method");
    }
}

class Child implements Parent{
    public void abstractMethod(){
        System.out.println("Interface abstract method 1");
    }
    public void abstractMethod2(){
        System.out.println("Interface abstract method 2");
    }
    public void abstractMethod3(){
        System.out.println("Interface abstract method 3");
    }
}
public class BasicDefaultMethod {
    public static void main(String[] args) {
        Child c1 = new Child();
        //default Method : 
        c1.defaultMethod();

        //interface Method
        c1.abstractMethod();
        c1.abstractMethod2();
        c1.abstractMethod3();
    }
}
