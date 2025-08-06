package com.collection.queue;

import java.awt.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static  void main(String []agrs)
    {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(100); //heap min , max
        queue.add(300);
        queue.add(50);
        queue.add(500);

        //add, peek , poll removes

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
