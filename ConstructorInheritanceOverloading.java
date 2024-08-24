//Super Class
class University{
    University(){
        System.out.println("Super Class Constructor");
    }
    University(String name){
        System.out.println("University Name : " + name);
    }
}

//Derived Class
class Department extends University{
    private int code;

    Department(){
        System.out.println("Sub Class Constructor");
    }

    Department(String name , int code){
        super(name);
        this.code = code;
        System.out.println("University Name : " + name + " && Code : " + code);
    }
}

//Child Derived Class
class Head extends Department{
    private String location;

    Head(){
        System.out.println("Sub Sub-Class Constructor");
    }

    Head(String name , int code , String location){
        super(name,code);
        this.location = location;
        System.out.println("University Name : " + name + " && Code : " + code + " && Location : " + location);
    }

}

//Main Class
public class ConstructorInheritanceOverloading {
    public static void main(String[] args) {
        Department d1 = new Department();
        /*Output : 1>> SuperClass Constructor
                   2>> SubClass Constructor
        */
        
        System.out.println();

        Department d2 = new Department("Stanford University" , 15245);

        System.out.println();

        Head h1 = new Head();
        /*Output : 1>> SuperClass Constructor
                   2>> SubClass Constructor
                   3>> Sub Sub-Class Constructor
        */

        System.out.println();

        Head h2 = new Head("Harvard University" ,54862 , "Cambridge");
    }
}
