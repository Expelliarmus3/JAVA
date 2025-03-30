package Threads;
class MyThr extends Thread{
    @Override
    public void run(){
        int i=0;
        //System.out.println("Good morning");
        while (i<100) {
            System.out.println("Good morning");
            i++;
        }
    }
}
class MyThr1 implements Runnable{
    public void run(){
        int i=0;
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //System.out.println("Welcome");
        while (i<100) {
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThr t1 = new MyThr();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        MyThr1 runnable= new MyThr1();
        Thread t2 = new Thread(runnable);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}
