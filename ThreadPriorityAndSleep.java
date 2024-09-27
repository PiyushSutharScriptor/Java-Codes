class A extends Thread{
    public void run(){
        for(int i=1 ; i<50 ; i++){
            System.out.println("Hello");
            try{
                   Thread.sleep(10);
            }
            catch(InterruptedException e){  
                System.out.println("error" + e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1 ; i<50 ; i++){
            System.out.println("Hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("error" + e);
            }
        }
    }
}
public class ThreadPriorityAndSleep{
    public static void main(String[] args) {
        A obj1 = new A();
        // System.out.println(obj1.getPriority());
        obj1.start();

        //Waiting(Optional)
        // try{
        //     Thread.sleep(5);
        // }
        // catch(InterruptedException e){
        //     System.out.println("error" + e);
        // }

        B obj2 = new B();
        obj2.start();
    }
}