class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Hello " + this.getName());
    }
}
public class ThreadPriority {
    public static void main(String[] args) {

        //Creating Threads : 
        MyThread t1 = new MyThread("Piyush 1");
        MyThread t2 = new MyThread("Piyush 2");
        MyThread t3 = new MyThread("Piyush 3");
        MyThread t4 = new MyThread("Piyush 4");
        MyThread t5 = new MyThread("Piyush 5");

        //Setting Priority : 
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        //Running Threads : 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
