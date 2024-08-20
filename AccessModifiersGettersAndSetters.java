class Public{
    public static void bike(){
        System.out.println("Public Method");
    }
}

class Protected{
    protected static void car(){
        System.out.println("Protected Method");
    }
}

class Private{
    private static void truck(){
        System.out.println("Private Method");
    }
}

class Employee{
    private int id;
    private String name;


    public void setId(int i){
        id = i;
    }

    public void setName(String empName){
        name = empName;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
public class AccessModifiersGettersAndSetters {
    public static void main(String[] args) {

        //Case : public
        Public.bike();

        //Case : protected
        Protected.car();

        //Case : private(Methods) Error
        // Private.truck(); //error: truck() has private access in Private

        //Case : private(Methods) Using Getters & Setters
        Employee e1 = new Employee();
        e1.setId(12548);
        System.out.println("Employee Id : " + (e1.getId()));
        e1.setName("Rahul");
        System.out.println("Employee Name : " + (e1.getName()));
    }
}


