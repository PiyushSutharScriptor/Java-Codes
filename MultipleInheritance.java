interface FirstName{
    public abstract void firstName();
}

interface LastName{
    public abstract void lastName();
}

class FullName implements FirstName,LastName{
    public void firstName(){
        System.out.println("Rahul");
    }

    public void lastName(){
        System.out.println("Ambani");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        FullName f1 = new FullName();
        f1.firstName();
        f1.lastName();
    }
}
