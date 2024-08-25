class A{
    public int first(){
        return 1;
    }
    public void meth(){
        System.out.println("Parent Class meth()");
    }
}

class B extends A{
    @Override
    public void meth(){
        System.out.println("Child Class meth()");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        //Child Class Overriding Parent Method : 
        B b1 = new B();
        b1.meth();

        //Inheritance from class : 
        int res = b1.first();
        System.out.println(res);

        //Parent Class Method : 
        A a1 = new A();
        a1.meth();
    }
}