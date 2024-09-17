import customPackage.*;

public class ImportingCustomPackage {
    public static void main(String[] args) {
        System.out.println("Created File For Importing Pacakage");     
        System.out.println("Importing Method.......");   
        CustomPackage1 p2 = new CustomPackage1();
        p2.greet();
        System.out.println("!!Importing Successfully!!");
    }
}
