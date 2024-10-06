class MyThread1 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){
            try{
                Thread.sleep(500);
                System.out.println("Thread 1");
                i++;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){
            try{
                Thread.sleep(500);
                System.out.println("Thread 2");
                i++;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread3 extends Thread{
    public void run(){
        int i=1;
        while(i>10){
            try{
                Thread.sleep(500);
                System.out.println("Thread 3");
                i++;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        //State Of t1 before start(): NEW
        System.out.println("Stata(t1) : " + t1.getState());
        //State Of t2 before start(): NEW/TIMED_WAITED
        System.out.println("State(t2) : " + t2.getState());
        //State Of t3 before start(): NEW
        System.out.println("State(t3) : " + t3.getState());
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println();

        //State Of t1 after start(): RUNNABLE
        System.out.println("State(t1) : " + t1.getState());
        //State Of t2 after start(): RUNNABLE
        System.out.println("State(t2) : " + t2.getState());
        //State Of t3 after start(): TERMINATED
        System.out.println("State(t3) : " + t3.getState());
    }
}
