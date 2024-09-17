import customPackage.CustomPackage1;

class Parent{
    public int a = 10;
    protected int b = 20;
    private int c = 30;
    int d = 40;

    //Same Class : 
    public void method1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Parent p1 = new Parent();

        //Same Class : 
        p1.method1();

        System.out.println();

        //Same Package : 
        System.out.println(p1.a);
        System.out.println(p1.b);
        // System.out.println(p1.c); ==> Gives Error(private)
        System.out.println(p1.d);

        //Sub class of different pacakages : 
        CustomPackage1 cp1 = new CustomPackage1();
        cp1.greet();
        //=> public = yes
        //=> protected = yes(Inheritance)
        //=> private = No
        //=> default = No

        //World (Everywhere)
        //=> public = yes
        //=> protected = No
        //=> private = No
        //=> default = No
    }
}
