class Parent extends Thread{
    public Parent(String name){
        // this.name = name;
        super(name);
    }

    public void run(){
        System.out.println("Basic Types Of Thread Constructors.");
    }
}
public class ThreadConstructorBasics {
    public static void main(String[] args) {
        Parent p1 = new Parent("Adam");
        p1.run();
        Parent p2 = new Parent("Smith");
        p1.run();

        System.out.println("Id (first) : " + p1.threadId());
        System.out.println(p1.getName());

        System.out.println("Id (second) : " + p2.threadId());
        System.out.println(p2.getName());
    }
}
