package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWorkerThread {
    public  static  void main(String ars[])
    {
        ExecutorService excutor = Executors.newFixedThreadPool(5);
        ExecutorService excutor1 = Executors.newFixedThreadPool(5);

        for(int i =0;i<10; i++)
        {
            Runnable worker = new WorkerThread("Thread" +i);

            excutor.execute(worker);
        }
        for(int i =0;i<10; i++)
        {
            Runnable worker = new WorkerThread("Thread" +i);

            excutor1.execute(worker);
        }

        excutor.shutdown();

    }
}
