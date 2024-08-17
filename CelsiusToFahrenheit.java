import java.util.Scanner;
public class CelsiusToFahrenheit {
    double cToF(double celsius){
        return ((celsius*9)/5)+32;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature In Celsius : ");
        double celsius = input.nextDouble();
        CelsiusToFahrenheit c1 = new CelsiusToFahrenheit();
        double convert = c1.cToF(celsius);
        System.out.println(celsius + " Celsius = " + convert + " Fahrenheit");
        input.close();
    }
}
