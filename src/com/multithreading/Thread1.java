package com.multithreading;

import java.awt.*;

public class Thread1 extends  Thread {

    public  static void  main(String agrs[]) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        Thread1 thread3 = new Thread1();

        thread1.setName("Thread 1");// setting up the name of thread
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();  //
        thread2.join();
        thread3.join();

        for(int i=1;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    @Override
    public  void  run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
/*
            try {
                //Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}


