interface ParentInterface{
    void meth1();
    void meth2();
}

interface ChildInterface extends ParentInterface{
    void meth3();
    void meth4();
}

class ObjectClass implements ChildInterface{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }
    public void meth4(){
        System.out.println("Method 4");
    }
}

public class InterfacesExtendsInterfaces {
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        obj1.meth1();
        obj1.meth2();
        obj1.meth3();
        obj1.meth4();
    }
}
