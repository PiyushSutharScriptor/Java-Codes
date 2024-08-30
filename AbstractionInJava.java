abstract class Vehicle{
    public abstract void sedan();
    abstract void suv();
    public int add(int a,int b){
        return a+b;
    }
    public static void greet(){
        System.out.println("Hello Java Programmers");
    }
}

class Cars extends Vehicle{
    public void sedan(){
        System.out.println("Verna");
    }

    void suv(){
        System.out.println("Fortuner");
    }

    double multiply(double a, double b){
        return a*b;
    }
}
public class AbstractionInJava {
    public static void main(String[] args) {

        //Object Creation
        Cars c1 = new Cars();

        //Abstract Methods
        c1.sedan();       
        c1.suv();      

        //Parent Method
        int addition = c1.add(10, 20);
        System.out.println(addition);

        //Child Method
        double multiplication = c1.multiply(10, 20);
        System.out.println(multiplication);

        //Static Method
        Vehicle.greet();
    }
}