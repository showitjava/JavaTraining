package com.multithreading;

public class MultiThreadingDemo extends Thread{

    public static  void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
        MultiThreadingDemo t1 = new MultiThreadingDemo();

        t1.start();
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
        }

    }

    public  void run()
    {
        System.out.println("Running new thread "+ Thread.currentThread().getName());
        for(int i=1;i<10;i++)
        {
            System.out.println(i*100);
        }
    }
}
