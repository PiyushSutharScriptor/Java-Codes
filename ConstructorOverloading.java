class Shape{
    private int length;
    private int width;
    private int height;

    Shape(int length , int width){
        this.length = length;
        this.width = width;
    }

    Shape(int length , int width , int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void display(){
        System.out.println("length : " + length + " , width : " + width + " , height : " + height);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Shape s1 = new Shape(20, 60);
        Shape s2 = new Shape(20, 60,10);
        s1.display();
        s2.display();
    }    
}
