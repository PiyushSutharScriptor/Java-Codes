class Phone{
    public void on(){
        System.out.println("Turning On Phone ....");
    }

    public void music(){
        System.out.println("Music In Phone");
    }
}

class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning On SmartPhone ....");
    }

    public void game(){
        System.out.println("Games In SmartPhone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Case : 01  
        Phone p1 = new Phone(); //>>Allowed
        SmartPhone sp1 = new SmartPhone(); //>>Allowed

        // Case : 02 
        Phone obj = new SmartPhone(); //Allowed
        //reference = ParentClass ; object = ChildClass
        obj.on();     //Overriding (Child Class)
        obj.music();  //Method (Parent Class)
        // obj.game();   //Method (Child Class) =>Not Allowed

        //Case : 03
        // SmartPhone obj2 = new Phone(); //Not Allowed

    }
}
