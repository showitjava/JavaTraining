package com.multithreading;

public class WorkerThread  implements  Runnable{

    private  String message;

    public WorkerThread(String message)
    {
        this.message =message;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " :start " + message);

    }
}
