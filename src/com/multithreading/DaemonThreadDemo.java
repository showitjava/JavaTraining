package com.multithreading;

public class DaemonThreadDemo extends  Thread{

    public static void main(String args[])
    {

        DaemonThreadDemo thread1 = new DaemonThreadDemo();
        DaemonThreadDemo thread2 = new DaemonThreadDemo();



        thread1.setDaemon(true);

        thread1.start();
        thread2.start();

    }

    @Override
    public  void run()
    {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("11111");
            System.out.println("Daemon Thread!!");
        }
        else{
            System.out.println("its user thread");
        }
    }

}



