package out.ShapesCustomPackages.Shapes;

import java.util.Scanner;

class Dimensons{
    public double length;
    public double breadth;
    public double side;
}

class Rectange extends Dimensons{
    public void area(double length, double breadth){
        System.out.println("Area Of Rectangle : " + (length*breadth));
    }
    public void perimeter(double length, double breadth){
        System.out.println("Rectangle Of Rectangle : " + (2*length+2*breadth));
    }
}

class Square extends Dimensons{
    public void area(double side){
        System.out.println("Area Of Square : " + (side*side));
    }
    public void perimeter(double side){
        System.out.println("Perimeter Of Square : " + (4*side));
    }
}

public class ShapesCustomPackages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length : "); 
        double length = input.nextDouble();

        System.out.print("Enter breadth : "); 
        double breadth = input.nextDouble();

        System.out.print("Enter side : "); 
        double side = input.nextDouble();

        Rectange r1 = new Rectange();
        r1.area(length, breadth);
        r1.perimeter(length, breadth);

        Square s1 = new Square();
        s1.area(side);
        s1.perimeter(side);
    }    
}
