import java.util.Scanner;

interface FirstName{
    public abstract String firstName(String fname);
}

interface LastName{
    public String lastName(String lname);
}

class FullName implements FirstName,LastName{
    public String firstName(String fname){
        return fname;
    }
    public String lastName(String lname){
        return lname;
    }
}

public class InterfaceWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name : ");
        String fname = input.nextLine();

        System.out.print("Enter Last Name : ");
        String lname = input.nextLine();

        FullName f1 = new FullName();
        String first = f1.firstName(fname);
        String second = f1.lastName(lname);

        System.out.println("Full Name : " + first + " " + second);

        input.close();
    }
}
