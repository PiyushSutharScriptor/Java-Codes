class A implements Runnable{
    public void run(){
        for(int i=1 ; i<5 ; i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("eroor" + e);
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1 ; i<5 ; i++){
            System.out.println("hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("error" + e);
            }
        }
    }
}


public class RunnableAndThread {
    public static void main(String[] args) {
        //Option : 01
        // A obj1 = new A();
        // B obj2 = new B();

        //Option : 02
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
