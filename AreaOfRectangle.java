import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length Of Rectangle : ");
        double length = input.nextDouble();
        System.out.print("Enter Breadth Of Rectangle : ");
        double breadth = input.nextDouble();
        System.out.println("Area Of Rectangle : "+(length*breadth));
    }
}
