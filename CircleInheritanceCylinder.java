import java.util.Scanner;

class Circle{
    public double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle{
    private double height;

    Cylinder(double radius , double height){
        super(radius);
        this.height = height;
    }

    public double volumeOfCylinder(){
        return Math.PI*radius*radius*height;   
    }
}
public class CircleInheritanceCylinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double radius = input.nextDouble();

        System.out.print("Enter Height : ");
        double height = input.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.println("Area Of Circle : " + c1.areaOfCircle());

        Cylinder cy1 = new Cylinder(radius, height);
        System.out.println("Volume Of Cylinder : " + cy1.volumeOfCylinder());

        input.close();
    }
}