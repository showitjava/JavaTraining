package com.multithreading;

 class Counter {

    public int count =0;

   synchronized void increment()
   {

       count++;
   }
}
// Race Condition
public  class RaceConditionDemo{

     public static void main(String agrs[]) throws InterruptedException {

         Counter counter = new Counter();

         Thread t1 = new Thread(() ->{
             for( int i =0;i<20000;i++)
             {
                 counter.increment();
             }
         }  );

         Thread t2 = new Thread(() ->{
             for( int i =0;i<20000;i++)
             {
                 counter.increment();
             }
         }  );

         t1.start();
         t2.start();
         //main thread

         t1.join();
         t2.join();

          System.out.println("Final counter:" + counter.count); // 40000



     }
}


//two person -1 2 -> sbi ->  1-> deposit 2 -> withdrawal   -> 1000   1100
// current balance + deposit  1000 +100
// current balance - withdrawal 1100 -200 -> 900


//100 -> 1-> lock
// 99 ->

