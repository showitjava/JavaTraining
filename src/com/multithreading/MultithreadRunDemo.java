package com.multithreading;

public class MultithreadRunDemo extends Thread1 implements  Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread implemtation!!");
        System.out.println(Thread.currentThread().getName());
    }


    public static  void main(String gars[])
    {
        Runnable th1 = new MultithreadRunDemo();

        Thread thread1 = new Thread(th1);

        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
