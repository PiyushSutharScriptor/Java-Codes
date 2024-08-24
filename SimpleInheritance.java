import java.util.Scanner;

//Super Class
class Animal{
    private String name;
    private String color;

    Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    } 

    public String getColor(){
        return color;
    }
}

//Sub Class
class Dog extends Animal{
    private int age;

    Dog(String name, String color , int age){
        super(name, color);
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}

//Main Class
public class SimpleInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.print("Enter Color : ");
        String color = input.nextLine();
        System.out.print("Enter Age : ");
        int age = input.nextInt();

        Dog d1 = new Dog(name, color, age);
        System.out.println("The Name Of Dog : " + d1.getName());
        System.out.println("The Color Of Dog : " + d1.getColor());
        System.out.println("The Age Of Dog : " + d1.getAge());

        input.close();
    }
}
