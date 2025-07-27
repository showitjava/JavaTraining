package com.multithreading;

public class ThreadPriorityDemo extends  Thread{

    public  void run()
    {
        System.out.println("Running new threadS!!");
    }


    public  static  void main(String gar[])
    {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();

        t1.start();
        t1.setPriority(2);
       System.out.println( t1.getPriority());

        t2.start();
        t2.setPriority(10);
        System.out.println( t2.getPriority());

        t3.start();
        t3.setPriority(9);
        System.out.println( t3.getPriority());

    }
}


