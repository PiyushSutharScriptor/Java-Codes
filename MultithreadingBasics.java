class Dog extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("boo boo");
            i++;
        }
    }
}
class Cat extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Meow Meow");
            i++;
        }
    }
}
public class MultithreadingBasics {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.start();
        Cat c1 = new Cat();
        c1.start();
    }
}
