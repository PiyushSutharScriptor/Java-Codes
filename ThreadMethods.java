class MyNewThread1 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("Thread 1");
            i++;
        }
    }
}

class MyNewThread2 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("Thread 2");
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.start();
        t1.join();
        t2.start();
    }
}
