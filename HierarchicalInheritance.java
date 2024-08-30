class Truck{
    public void twelveTyre(){
        System.out.println("12 tyre = 25-30 Tons");
    }

    public void eighteenTyre(){
        System.out.println("18 tyre = 40-55 Tons");
    }
}

class Volvo extends Truck{
    public void volvoTruck(){
        System.out.println("Volvo FH16 Aero");
    }
}

class Tata extends Truck{
    public void tataTruck(){
        System.out.println("Tata Prima 5530.S 6x4");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        //Object Creation
        Volvo v1 = new Volvo();
        Tata t1 = new Tata();

        //Super Class Methods
        v1.twelveTyre();
        t1.eighteenTyre();

        //Child Methods : 
        v1.volvoTruck();
        t1.tataTruck();

    }
}
