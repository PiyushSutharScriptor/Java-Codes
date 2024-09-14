interface Vehicle{
    public abstract void color();
    public void name();
}

class Car implements Vehicle{
    public void color(){
        System.out.println("Color : Red");
    }
    public void name(){
        System.out.println("Name : City");
    }
}

public class InterfaceBasic {
    public static void main(String args[]){
        Car c1 = new Car();
        c1.color();
        c1.name();
    }
}
