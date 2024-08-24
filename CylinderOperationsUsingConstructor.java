class Cylinder{
    private double height;
    private double radius;

    Cylinder(double height , double radius){
        this.height = height;
        this.radius = radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public double surfaceArea(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
}

public class CylinderOperationsUsingConstructor{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(17.5, 25.3);
        System.out.println("Volume Of Cylinder : " + (c1.volume()));
        System.out.println("Surface Area Of Cylinder : " + (c1.surfaceArea()));
    }
}