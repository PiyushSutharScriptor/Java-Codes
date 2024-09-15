interface Calling{
    abstract void attendcall();
    void cancelcall();
    //default Method
    default public void camera(){
        System.out.println("Camera Mode Interface");
    }
}

interface Music{
    void playMusic();
    void offMusic();
    //private method : 
    private void greet1(){
        System.out.println("Greet 1");
    }
    default public void greet2(){
        greet1();
        System.out.println("Greet 2");
    }
}

class Cellphone{
    public void camera(){
        System.out.println("Camera Mode");
    }

    public String[] network(){
        String arr[] = {"Piyush" , "Rohan" , "Mahesh"};
        return arr;
    }
}

class SmartPhone extends Cellphone implements Music,Calling{
    public void attendcall(){
        System.out.println("Attend the call...");
    }
    public void cancelcall(){
        System.out.println("Cancel the call!!!");
    }
    public void playMusic(){
        System.out.println("Playing music");
    }
    public void offMusic(){
        System.out.println("Turning off music");
    }
}

public class ImplementWithExtends{
    public static void main(String[] args) {
        //Object Creation : 
        SmartPhone s1 = new SmartPhone();

        //Calling String Array Method : 
        String arr[] = s1.network();
        for (String element : arr) {
            System.out.println(element);
        }

        System.out.println("\ndefault methods overriding");
        //Overriding Interfaces default Methods : 
        s1.camera();

        System.out.println("\nPrivate Method Using default Method : ");
        //private methods in constructor accessing
        // s1.greet1(); //throws an error(private=>Access Modifier)
        s1.greet2(); //Calling private method in default method

        System.out.println("\nInterface Methods : ");
        //Calling interfaces methods : 
        s1.attendcall();
        s1.cancelcall();
        s1.playMusic();
        s1.offMusic();

        System.out.println("\nDefaults Methods : ");
        //Calling default Methods : 
        s1.camera();
        s1.greet2();
    }
}