class Square{
    public double side;
    //constructor : 
    Square(double side){
        this.side = side;
    }

    //methods : 
    public double squareArea(){
        return side*side;
    }

    public double squarePerimeter(){
        return 4*side;
    }

}

class Rectangle{
    public double length;
    public double width;

    //constructor : 
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    //methods : 
    public double rectangleArea(){
        return length*width;
    }

    public double rectanglePerimeter(){
        return 2*(length+width);
    }

}

public class SquareAndRectangleFunUsingClass{
    public static void main(String[] args) {
        
        //square(area & Perimeter) : 
        Square s1 = new Square(5);
        System.out.println("The Area Of Square : " + s1.squareArea());
        System.out.println("The Perimeter Of Square : " + s1.squarePerimeter());
        
        System.out.println();

        //rectangle(area & Perimeter) : 
        Rectangle r1 = new Rectangle(20.25, 10.25);
        System.out.println("The Area Of Rectangle : " + r1.rectangleArea());
        System.out.println("The Perimeter Of Rectangle : " + r1.rectanglePerimeter());


    }
}