class A{
    public void parentMethod(){
        System.out.println("Parent Method");
    }
}

class B extends A{
    public void ChildMethod(){
        System.out.println("Child Method");
    }
}

class C extends B{
    public void subChildMethod(){
        System.out.println("Sub Child Method");
    }
}


public class MultiLevelInheritance {   
    public static void main(String[] args) {

        //Object Creation (Sub Child Method)
        C c1 = new C();

        //Parent Method
        c1.parentMethod();

        //Child Method : 
        c1.ChildMethod();

        //Sub Child Method : 
        c1.subChildMethod();
    }
}
